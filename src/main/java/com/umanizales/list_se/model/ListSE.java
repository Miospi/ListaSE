package com.umanizales.list_se.model;

import com.umanizales.list_se.controller.dto.ResponseDTO;
import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@Data
public class ListSE {
    private Node head;
    private int count;

    //agregar nino
    public void add(Boy boy) {
        if (head == null) {
            head = new Node(boy);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            // Recorre la lista y queda en el ultimo
            temp.setNext(new Node(boy));
        }
        count++;
    }

    public void addToStart(Boy boy) {
        if (this.head == null) {
            this.head = new Node(boy);
        } else {
            Node temp = new Node(boy);
            temp.setNext(this.head);
            this.head = temp;

        }
        count++;
    }


    public void invert() {
        if (this.head != null) {
            ListSE listTemp = new ListSE();
            Node temp = this.head;
            while (temp != null) {
                listTemp.addToStart(temp.getData());
                temp = temp.getNext();

            }
            this.head = listTemp.getHead();
        }

    }

    public int count() {
        int cont = 0;
        if (this.head != null) {
            ///recorre list
            Node temp = this.head;

            while (temp != null) {
                cont++;
                temp = temp.getNext();

            }
        }
        return cont;
    }

    public List<Boy> list() {

        if (this.head != null) {
            Node temp = this.head;
            List<Boy> list = new ArrayList<>();
            while (temp != null) {
                list.add(temp.getData());
                temp = temp.getNext();

            }
            return list;
        }
        return null;
    }

    // public void delete() {

    //  if (head == head) {
    //  head = head = null;

    //     } else {
    //     Node temp = this.head;
    //      while (temp.getNext() != null) {
    //           temp = temp.getNext();
    //       }
    //   temp = temp;

    //    temp.setNext(null) ;
    //   }
    //  return;
    // }


    // public void firstmean() {
    //   for (Boy m : list()) {
    //      if (m.getSex() == "M") {
    //           ListSE listTemp = new ListSE();
    //           Node temp = this.head;
    //          while (temp != null) {
    //              listTemp.add(temp.getData());
    //              temp = temp.getNext();
    //          }
//        }
    //   }

//}
}