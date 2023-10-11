package com.pje.rest.controller

import com.pje.rest.entity.Category
import com.pje.rest.service.CategoryService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/categories')
class CategoryController {
    @Autowired
    private final CategoryService categoryService
    
    @GetMapping('')
    List<Category> findAll() {
        categoryService.findAll()
    }

    @GetMapping('{id}')
    Category findById(@PathVariable('id') int id) {
        categoryService.findById(id)
    }

}
