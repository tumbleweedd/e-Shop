package com.example.demo.service;

import com.example.demo.dto.BucketDTO;
import com.example.demo.model.Bucket;
import com.example.demo.model.User;

import java.util.List;

public interface BucketService {
    Bucket createBucket(User user, List<Long> productIds);

    void addProduct(Bucket bucket, List<Long> productIds);

    BucketDTO getBucketByUser(String name);
}
