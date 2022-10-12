package com.kodilla.kodillahibernate.invoice;

import com.kodilla.kodillahibernate.invoice.dao.InvoiceDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Pencil");
        Product product2 = new Product("Rubber");
        Product product3 = new Product("Notebook");
        Product product4 = new Product("Pen");
        Product product5 = new Product("Calculator");

        Item item1 = new Item(new BigDecimal(4), 25);
        Item item2 = new Item(new BigDecimal(8), 5);
        Item item3 = new Item(new BigDecimal(2), 2);
        Item item4 = new Item(new BigDecimal(10), 10);
        Item item5 = new Item(new BigDecimal(18), 1);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product3);
        item5.setProduct(product3);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        product4.getItems().add(item4);
        product5.getItems().add(item5);

        Invoice invoice = new Invoice("FV/2022.10/11");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item5);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        item5.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);


    }
}
