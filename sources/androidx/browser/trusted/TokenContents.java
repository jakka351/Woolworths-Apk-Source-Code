package androidx.browser.trusted;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class TokenContents {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f214a;
    public String b;
    public ArrayList c;

    public TokenContents(byte[] bArr) {
        this.f214a = bArr;
    }

    public static TokenContents a(String str, ArrayList arrayList) throws IOException {
        Collections.sort(arrayList, new a(0));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return new TokenContents(byteArrayOutputStream.toByteArray(), str, arrayList);
    }

    public final void b() throws IOException {
        if (this.b != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f214a));
        this.b = dataInputStream.readUTF();
        int i = dataInputStream.readInt();
        this.c = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = dataInputStream.readInt();
            byte[] bArr = new byte[i3];
            if (dataInputStream.read(bArr) != i3) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.c.add(bArr);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TokenContents.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f214a, ((TokenContents) obj).f214a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f214a);
    }

    public TokenContents(byte[] bArr, String str, ArrayList arrayList) {
        this.f214a = bArr;
        this.b = str;
        this.c = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }
}
