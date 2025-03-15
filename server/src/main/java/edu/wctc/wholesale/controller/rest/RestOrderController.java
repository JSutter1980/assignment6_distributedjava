package edu.wctc.wholesale.controller.rest;

import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.service.WholesaleOrderService;
import jakarta.persistence.criteria.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:8080/api/orders")
@RequestMapping("/")
public class RestOrderController {
    private final WholesaleOrderService wholesaleOrderService;

    public RestOrderController(WholesaleOrderService wholesaleOrderService) { this.wholesaleOrderService = wholesaleOrderService; }

    @PostMapping
    public WholesaleOrder createOrder(@RequestBody WholesaleOrder wholesaleOrder) {
        wholesaleOrderService.createOrder(wholesaleOrder);
        return wholesaleOrder;
    }

    @PutMapping
    public Order updateOrder(@RequestBody WholesaleOrder wholesaleOrder) {
        wholesaleOrderService.updateOrder(wholesaleOrder);
        return (Order) wholesaleOrder;
    }

    @DeleteMapping("/{orderId}")
    public String deleteOrder(@PathVariable int orderId) {
        wholesaleOrderService.delete(orderId);
        return "Order deleted successfully";
    }

    @GetMapping
    public List<WholesaleOrder> getAllOrders() { return wholesaleOrderService.getAllOrders(); }

    @GetMapping("/{orderId}")
    public WholesaleOrder getOrder(@PathVariable int orderId) { return wholesaleOrderService.getAllOrders().get(orderId);}


}
