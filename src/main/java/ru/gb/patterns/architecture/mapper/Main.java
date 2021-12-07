package ru.gb.patterns.architecture.mapper;

import ru.gb.patterns.architecture.mapper.db.MysqlDB;
import ru.gb.patterns.architecture.mapper.mapper.AccountCachedMapper;
import ru.gb.patterns.architecture.mapper.mapper.AccountMapper;
import ru.gb.patterns.architecture.mapper.mapper.AccountRepository;
import ru.gb.patterns.architecture.mapper.model.Account;

public class Main {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();

        AccountRepository accountRepository = new AccountCachedMapper(new AccountMapper(mysqlDB.getConnection()));

        accountRepository.findAll();

        Account account = accountRepository.findById(5L);
        System.out.println(account);

        account = accountRepository.findById(5L);
        System.out.println(account);

        account = accountRepository.findById(5L);
        System.out.println(account);

        accountRepository.findAll();

        mysqlDB.close();
    }
}
