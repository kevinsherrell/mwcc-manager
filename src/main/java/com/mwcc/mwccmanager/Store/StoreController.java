package com.mwcc.mwccmanager.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "api/store")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @PostMapping("/add")
    public ResponseEntity<?> addStore(@RequestBody Store store) throws Exception {
        store.setId(0L);
        storeService.saveOrUpdateStore(store);
        return new ResponseEntity<>(store, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStore(@PathVariable Long id, @RequestBody Store store) throws Exception{
        store.setId(id);
        storeService.saveOrUpdateStore(store);
        return new ResponseEntity<>(store, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<?> addStore() {
        return new ResponseEntity<>(storeService.getAll(), HttpStatus.ACCEPTED);
    }
    @GetMapping("id/{id}")
    public ResponseEntity<?> getStoreById(@PathVariable Long id){
        return new ResponseEntity<>(storeService.getById(id), HttpStatus.ACCEPTED);
    }

}
