package service;

import entity.ShareHolder;
import entity.User;
import repository.ShareHolderRepository;
import repository.UserRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class ShareHolderService {

    private final ShareHolderRepository shareHolderRepository = new ShareHolderRepository();
    Scanner scanner = new Scanner(System.in);

    public ShareHolderService() throws SQLException {
    }

    public void register(ShareHolder shareHolder) throws SQLException {
        int result = shareHolderRepository.save(shareHolder);
        if(result != 0)
            System.out.println(shareHolder.getName() + " successfully added to database");
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
