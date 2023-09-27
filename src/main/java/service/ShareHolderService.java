package service;

import entity.ShareHolder;
import entity.User;
import repository.ShareHolderRepository;
import repository.UserRepository;

import java.sql.SQLException;

public class ShareHolderService {

    private final ShareHolderRepository shareHolderRepository = new ShareHolderRepository();

    public ShareHolderService() throws SQLException {
    }

    public void register() throws SQLException {
        ShareHolder shareHolder = new ShareHolder(null,"Amancio Ortega","09126287878","4160983658");
        int result = shareHolderRepository.save(shareHolder);
        if(result != 0)
            System.out.println(shareHolder.getName() + " successfully added to database");
        else
            System.out.println("OOps! :(");
    }
}
