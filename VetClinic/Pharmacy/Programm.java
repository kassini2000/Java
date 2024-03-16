package VetClinic.Pharmacy;

import java.util.Iterator;

import VetClinic.Pharmacy.Impl.Asitromin;
import VetClinic.Pharmacy.Impl.Penicilinium;
import VetClinic.Pharmacy.Impl.Vetbicid;

public class Programm {
    public static void main(String[] args) {
        Asitromin asitr = new Asitromin("Asitro", 50, 70);
        Penicilinium penicilinium = new Penicilinium("Penicil", 30, 50);
        Vetbicid vetbic = new Vetbicid("Vetbic", 40, 30);
        Medicine medicine1 = new Medicine();
        medicine1.addComponent(asitr).addComponent(penicilinium).addComponent(vetbic);
//        for (MedicineComponent companent : medicine1) {
//
//        }
        Iterator<MedicineComponent> med = medicine1;
        while (med.hasNext()) {
            System.out.println(med.next());
        }
    }

}