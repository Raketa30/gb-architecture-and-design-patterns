package ru.gb.patterns.architecture.mapper.mapper;

import ru.gb.patterns.architecture.mapper.model.Account;

import java.util.Collection;

public interface AccountRepository {
    public Account create(Account account);

    public Collection<Account> findAll();

    public Account findById(Long id);

    public Account update(Account account);

    public Account delete(Account account);
}
