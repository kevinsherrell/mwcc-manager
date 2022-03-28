package com.mwcc.mwccmanager.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public Store saveOrUpdateStore(Store store) throws Exception {
        return storeRepository.save(store);
    }

    public Iterable<Store> getAll() {
        return storeRepository.findAll();
    }
    public Optional<Store> getById(Long id){
        return storeRepository.findById(id);
    }
}
