package trilha.Desafio3.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.models.Categoria;
import trilha.back.financys.models.Lancamento;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("Entry")
public class EntryController {

    private ArrayList<Entry>lista = new ArrayList<>();

    @PostMapping("/salvar")
    public ResponseEntity<Entry> save(@RequestBody Entry EntryBody){
        var Entry = new Entry();

        Entry.setId(EntryBody.getId());
        Entry.setName(EntryBody.getName());
        Entry.setDescription(EntryBody.getDescription());
        Entry.setType(EntryBody.getType());
        Entry.setAmount(EntryBody.getAmount());
        Entry.setDate(EntryBody.getDate());

        lista.add(Entry);

        return ResponseEntity.ok(Entry);
    }

    @GetMapping(path ="/")
    public ResponseEntity<List<Entry>> getLista(){
        return ResponseEntity.ok(lista);
    }


//    @PatchMapping(path = "/{id}")
//    public ResponseEntity<Entry> update(@PathVariable Long id, @RequestBody Entry EntryBody){
//
//        var idEntry = Long.valueOf(id).intValue();
//        var item = lista.get(idEntry);
//
//        item.setId(EntryBody.getId());
//        item.setName(EntryBody.getName());
//        item.setDescription(EntryBody.getDescription());
//        item.setType(EntryBody.getType());
//        item.setAmount(EntryBody.getAmount());
//        item.setDate(EntryBody.getDate());
//
//        return ResponseEntity.ok(item);
//    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<Entry> updateid(@PathVariable("id") Long id , @RequestBody Entry Entry){
        var idEntry = Long.valueOf(id - 1).intValue();

        return ResponseEntity.ok(idEntry);
    }

}
