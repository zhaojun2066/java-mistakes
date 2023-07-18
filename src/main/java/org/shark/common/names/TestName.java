package org.shark.common.names;

import java.util.List;

public class TestName {
    public static void main(String[] args) {

       int a = 100;

       int x = 8000;

       for (int i = 0; i < a; i++) {
           System.out.println(i);
       }

    }

    public void closeOrder(Integer orderId){
        //..........................
    }

    //        //获取Dog 集合
//        List<Dog> dogList = dogService.getDogs();
//    private  static DogService dogService = new DogService() {
//        @Override
//        public List<Dog> getDogs() {
//            return null;
//        }
//    };


    public void createPurchaseOrder(PurchaseOrder purchaseOrder,String approverPhoneNumber){
        //创建订单
        //....
        //发送通知审批
    }

    public enum OrderStatus{
        STARTED,
        FINISHED,
        CANCELLED;
    }

//    public enum OrderStatus{
//        BEGAN,
//        FINISHED,
//        CANCELLED;
//    }


}
