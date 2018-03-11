package com.kodilla.kodillahibernate.invoice.dao;

import com.kodilla.kodillahibernate.invoice.Invoice;
import com.kodilla.kodillahibernate.invoice.Item;
import com.kodilla.kodillahibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    private static final String NUMBER = "12/2018";

    @Test
    public void testInvoiceDaoSave() {

        Item item1 = new Item(new BigDecimal(1), 3, new BigDecimal(3));
        Item item2 = new Item(new BigDecimal(3), 2, new BigDecimal(6));
        Item item3 = new Item(new BigDecimal(4), 2, new BigDecimal(8));
        Product product = new Product("candy");
        Product product1 = new Product("lollipop");

        product.getItems().add(item1);
        product.getItems().add(item2);
        product1.getItems().add(item3);
        item1.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product1);

        Invoice invoice = new Invoice(NUMBER);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoiceDao.save(invoice);
        int id = invoice.getId();

        Assert.assertNotEquals(0,id);

        invoiceDao.delete(id);

    }
}
