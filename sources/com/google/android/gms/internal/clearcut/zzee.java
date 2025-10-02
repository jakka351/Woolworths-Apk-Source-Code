package com.google.android.gms.internal.clearcut;

/* loaded from: classes5.dex */
final class zzee {
    private final String info;
    private int position = 0;

    public zzee(String str) {
        this.info = str;
    }

    public final boolean hasNext() {
        return this.position < this.info.length();
    }

    public final int next() {
        String str = this.info;
        int i = this.position;
        this.position = i + 1;
        char cCharAt = str.charAt(i);
        if (cCharAt < 55296) {
            return cCharAt;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        while (true) {
            String str2 = this.info;
            int i4 = this.position;
            this.position = i4 + 1;
            char cCharAt2 = str2.charAt(i4);
            if (cCharAt2 < 55296) {
                return i2 | (cCharAt2 << i3);
            }
            i2 |= (cCharAt2 & 8191) << i3;
            i3 += 13;
        }
    }
}
