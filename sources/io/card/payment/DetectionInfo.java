package io.card.payment;

/* loaded from: classes7.dex */
class DetectionInfo {
    public boolean bottomEdge;
    public boolean complete = false;
    public CreditCard detectedCard;
    public int expiry_month;
    public int expiry_year;
    public float focusScore;
    public boolean leftEdge;
    public int[] prediction;
    public boolean rightEdge;
    public boolean topEdge;

    public DetectionInfo() {
        int[] iArr = new int[16];
        this.prediction = iArr;
        iArr[0] = -1;
        iArr[15] = -1;
        this.detectedCard = new CreditCard();
    }
}
