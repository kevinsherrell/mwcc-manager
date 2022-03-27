package com.mwcc.mwccmanager.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public Store saveOrUpdateStore(Store store) throws Exception{
        return storeRepository.save(store);
    }
}
