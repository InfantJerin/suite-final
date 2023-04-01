package com.crm.remman.service;

import com.crm.remman.model.CustomerOrder;
import com.crm.remman.model.OrderItem;
import com.crm.remman.repository.OrderItemRepository;
import com.crm.remman.repository.OrderRepository;
import com.crm.remman.repository.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RawMaterialRepository rawMaterialRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    public CustomerOrder createOrder(CustomerOrder customerOrder) {
        return orderRepository.save(customerOrder);
    }

    public OrderItem createOrderItem(Long orderId, OrderItem orderItem) {
       return null;
    }

    /*public List<RawMaterialRemnant> getRemnantsForOrder(Long orderId) {
        Order order = getOrderById(orderId);
        List<RawMaterialRemnant> rawMaterialRemnants = new ArrayList<>();
        for (OrderItem orderItem : order.getOrderItems()) {
            for (RawMaterial rawMaterial : orderItem.getRawMaterials()) {
                RawMaterialRemnant rawMaterialRemnant = new RawMaterialRemnant();
                rawMaterialRemnant.setRawMaterial(rawMaterial);
                rawMaterialRemnant.setRemnant(getRemnantForRawMaterial(rawMaterial));
                rawMaterialRemnants.add(rawMaterialRemnant);
            }
        }
        return rawMaterialRemnants;
    }

    private Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id " + orderId));
    }

    private Double getRemnantForRawMaterial(RawMaterial rawMaterial) {
        List<OrderItem> orderItems = orderItemRepository.findByRawMaterialId(rawMaterial.getId());
        double totalQuantity = rawMaterial.getQuantity();
        for (OrderItem orderItem : orderItems) {
            if (orderItem.getOrder().getStatus() == OrderStatus.COMPLETED) {
                totalQuantity -= orderItem.getQuantity() * rawMaterial.getQuantityPerItem();
            }
        }
        return totalQuantity;
    } */
}
