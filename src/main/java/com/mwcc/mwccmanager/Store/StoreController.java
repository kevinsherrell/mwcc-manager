package com.mwcc.mwccmanager.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="api/store")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @PostMapping("/add")
    public ResponseEntity<?> addStore(@RequestBody Store store) throws Exception{
        store.setId(0L);
        storeService.saveOrUpdateStore(store);
        return new ResponseEntity<>(store, HttpStatus.CREATED);
    }
}
