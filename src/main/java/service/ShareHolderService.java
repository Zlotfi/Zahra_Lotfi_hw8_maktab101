package service;

import entity.ShareHolder;
import entity.User;
import repository.ShareHolderRepository;
import repository.UserRepository;
import utility.Validation;

import java.sql.SQLException;
import java.util.Scanner;

public class ShareHolderService {

    private final ShareHolderRepository shareHolderRepository;
    Scanner scanner = new Scanner(System.in);

    public ShareHolderService(ShareHolderRepository shareHolderRepository){
        this.shareHolderRepository = shareHolderRepository;
    }

    public void register(int shareid) throws SQLException {
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Please enter your phoneNumber:");
        String phoneNumber = null;
        boolean flag = true;
        while (flag) {
            phoneNumber = scanner.nextLine();
            if (Validation.isValidPhoneNumberWithRegex(phoneNumber))
                flag = false;
            else
                System.out.println("Please enter a valid phonenumber");
        }
        System.out.println("Please enter your nationalCode:");
        String nationalCode = null;
        boolean flag1 = true;
        while (flag1) {
            nationalCode = scanner.nextLine();
            if (Validation.isValidNationalCodeWithRegex(nationalCode))
                flag1 = false;
            else
                System.out.println("Please enter a valid nationalcode");
        }
        int result = shareHolderRepository.save(shareid,name,phoneNumber,nationalCode);
        if(result != 0)
            System.out.println(name + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }

    public void changeShareHolder(int shareid) throws SQLException {
        System.out.println("Please enter your new name:");
        String name = scanner.nextLine();

        System.out.println("Please enter your new phoneNumber");
        String phoneNumber = scanner.nextLine();

        System.out.println("Please enter your new nationalCode");
        String nationalCode = scanner.nextLine();
        int result = shareHolderRepository.updateShareHolder(shareid,name,phoneNumber,nationalCode);
        if(result != 0)
            System.out.println("successfully edited to database");
        else
            System.out.println("OOps! :(");
    }

    public void delete(int shareid) throws SQLException {
        int result = shareHolderRepository.deleteShareHolder(shareid);
        if(result != 0)
            System.out.println("successfully deleted from database");
        else
            System.out.println("OOps! :(");
    }
}
