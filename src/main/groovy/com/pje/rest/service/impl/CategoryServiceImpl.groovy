package com.pje.rest.service.impl

import com.pje.rest.entity.Category
import com.pje.rest.repository.CategoryRepository
import com.pje.rest.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryServiceImpl implements CategoryService {
    @Autowired
    private final CategoryRepository CategoryRepository
    
    @Override
    List<Category> findAll() {
        CategoryRepository.findAll()
    }

    @Override
    Category findById(int id) {
        CategoryRepository.findById(id)
    }

}
