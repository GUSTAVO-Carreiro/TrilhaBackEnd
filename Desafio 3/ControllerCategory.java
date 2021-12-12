package trilha.Desafio3.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.FinancysApplication;
import trilha.back.financys.models.Categoria;

import java.util.ArrayList;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping(value = "/Gustavo")
@Api("BackEndApplication")
@CrossOrigin(origins = "*")
public class CategoryController {

    private ArrayList<Category> lista = new ArrayList<Category>();

    @PostMapping("/salvar")
    @ApiOperation(value = "Salva a lista de Categorias")
    public ResponseEntity<Categoria> save(@RequestBody Category CategoryBody) {
        var Category = new Category();

        Category.setId(CategoryBody.getId());
        Category.setName(CategoryBody.getName());
        Category.setDescription(CategoryBody.getDescription());

        lista.add(Category);

        return ResponseEntity.ok(categoria);
    }

    @GetMapping(path = "/")
    @ApiOperation(value = "Retornar a lista de categorias")
    public ResponseEntity<List<Categoria>> getLista() {

        return ResponseEntity.ok(lista);
    }

    @GetMapping(path = "/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return getCategoryById(id);
    }

    @PatchMapping(value = "/{id}")
    public void updateCategoria(@PathVariable("id") Long id,@RequestBody Categoria categoriaRequestDto) {
        var idcategoria = Long.valueOf(id - 1).intValue();

        var item = lista.get(idCategory);

        item.setId(CategoryBody.getId());
        item.setName(CategoryBody.getName());
        item.setDescription(CategoryBody.getDescription());

        return ResponseEntity.ok(categoria);
        System.out.println("Agora Chegueiiiiiii");
    }

    @PatchMapping(value = "/{id}")
    @ApiOperation(value = "Altera itens na lista de categorias")
    public ResponseEntity<Category> updateid(@PathVariable("id") Long id , @RequestBody Category Category){
        var idCategory = Long.valueOf(id - 1).intValue();
//        var item = lista.get(Integer.parseInt(String.valueOf(id)));
//          item.setName(Category.getName());
//          item.setDescription(Category.getDescription());

        return ResponseEntity.ok(Category);
    }
}

