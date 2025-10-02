package org.bouncycastle.pqc.crypto.crystals.dilithium;

import YU.a;

/* loaded from: classes8.dex */
class PolyVecL {
    private int dilithiumK;
    private int dilithiumL;
    private DilithiumEngine engine;
    private int mode;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVecL() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public void addPolyVecL(PolyVecL polyVecL) {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).addPoly(polyVecL.getVectorIndex(i));
        }
    }

    public boolean checkNorm(int i) {
        for (int i2 = 0; i2 < this.dilithiumL; i2++) {
            if (getVectorIndex(i2).checkNorm(i)) {
                return true;
            }
        }
        return false;
    }

    public void copyPolyVecL(PolyVecL polyVecL) {
        for (int i = 0; i < this.dilithiumL; i++) {
            for (int i2 = 0; i2 < 256; i2++) {
                polyVecL.getVectorIndex(i).setCoeffIndex(i2, getVectorIndex(i).getCoeffIndex(i2));
            }
        }
    }

    public void expandMatrix(byte[] bArr, int i) {
        for (int i2 = 0; i2 < this.dilithiumL; i2++) {
            this.vec[i2].uniformBlocks(bArr, (short) ((i << 8) + i2));
        }
    }

    public Poly getVectorIndex(int i) {
        return this.vec[i];
    }

    public void invNttToMont() {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).invNttToMont();
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecL polyVecL) {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).pointwiseMontgomery(poly, polyVecL.getVectorIndex(i));
        }
    }

    public void polyVecNtt() {
        for (int i = 0; i < this.dilithiumL; i++) {
            this.vec[i].polyNtt();
        }
    }

    public void reduce() {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).reduce();
        }
    }

    public String toString() {
        String strG = "\n[";
        for (int i = 0; i < this.dilithiumL; i++) {
            strG = strG + "Inner Matrix " + i + " " + getVectorIndex(i).toString();
            if (i != this.dilithiumL - 1) {
                strG = a.g(strG, ",\n");
            }
        }
        return a.g(strG, "]");
    }

    public void uniformEta(byte[] bArr, short s) {
        int i = 0;
        while (i < this.dilithiumL) {
            getVectorIndex(i).uniformEta(bArr, s);
            i++;
            s = (short) (s + 1);
        }
    }

    public void uniformGamma1(byte[] bArr, short s) {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).uniformGamma1(bArr, (short) ((this.dilithiumL * s) + i));
        }
    }

    public PolyVecL(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.vec = new Poly[this.dilithiumL];
        for (int i = 0; i < this.dilithiumL; i++) {
            this.vec[i] = new Poly(dilithiumEngine);
        }
    }

    public String toString(String str) {
        StringBuilder sbT = a.t(str, ": ");
        sbT.append(toString());
        return sbT.toString();
    }
}
