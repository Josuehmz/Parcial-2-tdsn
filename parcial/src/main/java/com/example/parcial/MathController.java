package com.example.parcial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
@RestController
public class MathController{
    @GetMapping("/api/lineal")
    public String linealSearch (@RequestParam ("a") ArrayList[] a){
        ArrayList target = new ArrayList();
        for (int i = 0; i < a.length; i++){
            if (a[i] == target){
                return "Encontrado en la posicion: " + i;
            }
        }
        return "No encontrado";
    }

    @GetMapping("/api/binary")
    public String binarySearch (@RequestParam ("a") ArrayList[] a){
        ArrayList target = new ArrayList();
        int left = 0;
        int right = a.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (a[mid] == target){
                return "Encontrado en la posicion: " + mid;
            } else if (a[mid].hashCode() < target.hashCode()){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return "No encontrado";
    }
}
