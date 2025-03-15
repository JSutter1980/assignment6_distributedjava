package edu.wctc.wholesale.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.repo.WholesaleOrderRepository;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WholesaleOrderService {
    private WholesaleOrderRepository wholesaleOrderRepository;

    public WholesaleOrderService(WholesaleOrderRepository wholesaleOrderRepository) {this.wholesaleOrderRepository = wholesaleOrderRepository;}

    public void delete(long orderId) { wholesaleOrderRepository.deleteById(orderId);}

    public List<WholesaleOrder> getAllOrders() {
        List<WholesaleOrder> list = new ArrayList<>();
        wholesaleOrderRepository.findAll().forEach(list::add);
        return list;
    }

    public void createOrder(WholesaleOrder wholesaleOrder) {
        wholesaleOrder.setId(0);
        wholesaleOrderRepository.save(wholesaleOrder);
    }

    public void updateOrder(WholesaleOrder wholesaleOrder) { wholesaleOrderRepository.save(wholesaleOrder); }

}
