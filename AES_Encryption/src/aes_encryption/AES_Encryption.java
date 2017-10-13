/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aes_encryption;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;


/**
 *
 * @author Alex Lp
 */
public class AES_Encryption {
    
    private static SecretKeySpec secretKey;
    private static byte[] key;
    private static String decryptedString;
    private static String encryptedString;
    
    public static void setKey(String myKey){
    
        MessageDigest sha = null;
        try{
            key = myKey.getBytes("UTF-8");
            System.out.println(key.length);
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); //change the bits later 128 then 256
            System.out.println(key.length);
            System.out.println(new String(key,"UTF-8"));
            secretKey = new SecretKeySpec(key, "AES");
        }catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        } catch(UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    }
    
    public static String getDecryptedString(){
        return decryptedString;
    }
    public static void setDecryptedString(String decryptedString){
        AES_Encryption.decryptedString = decryptedString;
    }
    
    public static String getEncryptedString(){
        return encryptedString;
    }
    
    public static void setEncryptedString(String encryptedString){
        AES_Encryption.encryptedString = encryptedString;
    }
    
    public static String encrypt(String strToEncrypt){
        try{
            Cipher cipher = Cipher.getInstance("AES_Encryption/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            setEncryptedString(Base64.encodeBase64String(cipher.doFinal(strToEncrypt.getBytes("UTF-8"))));
        } catch(Exception e)
        {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }
    
    public static String decrypt(String strToDecrypt){
    
         try
        {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
           
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            setDecryptedString(new String(cipher.doFinal(Base64.decodeBase64(strToDecrypt))));
            
        }
        catch (Exception e)
        {
         
            System.out.println("Error while decrypting: "+e.toString());
        }
        return null;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String strtoEncrypt = "TEST";
        final String strPassword = "1234567890";
        AES_Encryption.setKey(strPassword);
               
        AES_Encryption.encrypt(strtoEncrypt.trim());
                
        System.out.println("String to Encrypt: " + strtoEncrypt); 
        System.out.println("Encrypted: " + AES_Encryption.getEncryptedString());
           
        final String strToDecrypt =  AES_Encryption.getEncryptedString();
        AES_Encryption.decrypt(strToDecrypt.trim());
              
        System.out.println("String To Decrypt : " + strToDecrypt);
        System.out.println("Decrypted : " + AES_Encryption.getDecryptedString());
        
    
    }
    
}
