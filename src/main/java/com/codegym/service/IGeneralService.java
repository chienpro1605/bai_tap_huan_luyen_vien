package com.codegym.service;

import java.util.Optional;

public interface IGeneralService<T> { // interface sử dụng generic mô tả các phương chung mà tất cả các service cần có
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);
}