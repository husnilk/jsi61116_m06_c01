package id.ac.unand.fti.si.pbo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {
    
    @Test
    public void testClassMemberExists(){
        try {
            Class<?> memberClass = Class.forName("id.ac.unand.fti.si.pbo.Member");
        } catch (ClassNotFoundException e) {
            assertTrue(false, "Class Member tidak ditemukan");
        } 
    }
    
    @Test
    public void testHitungPembayaran(){
        try {
            Class<?> memberClass = Class.forName("id.ac.unand.fti.si.pbo.Member");
            Class<?>[] params01 = { Integer.class };
            
            memberClass.getMethod("hitungTotalBayar", params01);
            
            Member member = new Member();
            int totalBayar = 0;
            totalBayar = member.hitungTotalBayar(250000);
            assertEquals(250000, totalBayar);
            
            totalBayar = member.hitungTotalBayar(750000);
            assertEquals(742500, totalBayar);
            
            totalBayar = member.hitungTotalBayar(2500000);
            assertEquals(2425000, totalBayar);
            
            totalBayar = member.hitungTotalBayar(25000000);
            assertEquals(23750000, totalBayar);
            
        } catch (ClassNotFoundException e) {
            assertTrue(false, "Class Member tidak ditemukan");
        } catch (NoSuchMethodException e) {
            assertTrue(false, "Method hitungTotalBayar tidak ditemukan atau tidak sesuai");
        } catch (SecurityException e) {
            
        } 
    }
    
    @Test
    public void testCekPoinAfterShopping(){
        
        try {
            Class<?> memberClass = Class.forName("id.ac.unand.fti.si.pbo.Member");
            Class<?>[] params01 = { Integer.class };
            
            memberClass.getMethod("hitungTotalBayar", params01);
            memberClass.getMethod("getPoin");
            
            Member member = new Member();
            member.hitungTotalBayar(250000);
            assertEquals(25, member.getPoin());

            member.hitungTotalBayar(750000);
            assertEquals(99, member.getPoin());

            
        } catch (ClassNotFoundException e) {
            assertTrue(false, "Class Member tidak ditemukan");
        } catch (NoSuchMethodException e) {
            assertTrue(false, "Method hitungTotalBayar tidak ditemukan atau tidak sesuai");
        } catch (SecurityException e) {
            
        } 
    }
    
    @Test
    public void testRedeemPoinShopping(){
        
        try {
            Class<?> memberClass = Class.forName("id.ac.unand.fti.si.pbo.Member");
            Class<?>[] params01 = { Integer.class };
            
            memberClass.getMethod("hitungTotalBayar", params01);
            memberClass.getMethod("redeemPoin", params01);
            
            Member member = new Member();
            member.hitungTotalBayar(250000);
            assertEquals(25, member.getPoin());

            member.hitungTotalBayar(750000);
            assertEquals(99, member.getPoin());

            member.redeemPoin(26);
            assertEquals(73, member.getPoin());

        } catch (ClassNotFoundException e) {
            assertTrue(false, "Class Member tidak ditemukan");
        } catch (NoSuchMethodException e) {
            assertTrue(false, "Method hitungTotalBayar atau method redeemPoin tidak ditemukan atau tidak sesuai");
        } catch (SecurityException e) {
            
        } 
    }

    @Test
    public void testMemberPlatinumExists(){
        
        try {
            Class<?> memberClass = Class.forName("id.ac.unand.fti.si.pbo.MemberPlatinum");
            
            Member member = new Member();
            if(!(member instanceof Member)){
                assertTrue(false, "Kelas MemberPlatinum bukan turunan dari kelas Member");
            }
        
        } catch (ClassNotFoundException e) {
            assertTrue(false, "Class MemberPlatinum tidak ditemukan");
        }
    }

    @Test
    public void testSaldoOnMemberPlatinum(){
        try {
            Class<?> platinumClass = Class.forName("id.ac.unand.fti.si.pbo.MemberPlatinum");
            Class<?>[] params01 = { Integer.class };

            platinumClass.getMethod("depositSaldo", params01);
            platinumClass.getMethod("getSaldo");

            MemberPlatinum member = new MemberPlatinum();
            assertEquals(0, member.getSaldo());

            member.depositSaldo(2000001);
            assertEquals(2000001, member.getSaldo());
            
        
        } catch (ClassNotFoundException e) {
            assertTrue(false, "Class MemberPlatinum tidak ditemukan");
        } catch (NoSuchMethodException e) {
            assertTrue(false, "Method depositSaldo dan getSaldo tidak ditemukan");
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMethodOnMemberPlatinum(){
        
        try {
            Class<?> memberClass = Class.forName("id.ac.unand.fti.si.pbo.MemberPlatinum");
            Class<?>[] params01 = { Integer.class };
            
            memberClass.getMethod("hitungTotalBayar", params01);
            
            MemberPlatinum member = new MemberPlatinum();
            int totalBayar = 0;
            totalBayar = member.hitungTotalBayar(250000);
            assertEquals(250000, totalBayar);
            
            totalBayar = member.hitungTotalBayar(750000);
            assertEquals(742500, totalBayar);
            
            totalBayar = member.hitungTotalBayar(2500000);
            assertEquals(2425000, totalBayar);
            // assertEquals(100, member.getPoin());

            totalBayar = member.hitungTotalBayar(25000000);
            assertEquals(23250000, totalBayar);
            

            
        } catch (ClassNotFoundException e) {
            assertTrue(false, "Class MemberPlatinum tidak ditemukan");
        } catch (NoSuchMethodException e) {
            assertTrue(false, "Method hitungTotalBayar tidak ditemukan atau tidak sesuai");
        } catch (SecurityException e) {
            
        } 
    }
}
