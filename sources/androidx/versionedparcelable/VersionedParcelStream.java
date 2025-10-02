package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

@RestrictTo
/* loaded from: classes2.dex */
class VersionedParcelStream extends VersionedParcel {
    public static final Charset m = Charset.forName("UTF-16");
    public final DataInputStream d;
    public final DataOutputStream e;
    public final DataInputStream f;
    public DataOutputStream g;
    public FieldBuffer h;
    public boolean i;
    public int j;
    public int k;
    public int l;

    public static class FieldBuffer {

        /* renamed from: a, reason: collision with root package name */
        public final ByteArrayOutputStream f3817a;
        public final DataOutputStream b;
        public final int c;
        public final DataOutputStream d;

        public FieldBuffer(int i, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f3817a = byteArrayOutputStream;
            this.b = new DataOutputStream(byteArrayOutputStream);
            this.c = i;
            this.d = dataOutputStream;
        }
    }

    public VersionedParcelStream(InputStream inputStream, OutputStream outputStream, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.j = 0;
        this.k = -1;
        this.l = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new FilterInputStream(inputStream) { // from class: androidx.versionedparcelable.VersionedParcelStream.1
            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i = versionedParcelStream.l;
                if (i != -1 && versionedParcelStream.j >= i) {
                    throw new IOException();
                }
                int i2 = super.read();
                versionedParcelStream.j++;
                return i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws IOException {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i = versionedParcelStream.l;
                if (i != -1 && versionedParcelStream.j >= i) {
                    throw new IOException();
                }
                long jSkip = super.skip(j);
                if (jSkip > 0) {
                    versionedParcelStream.j += (int) jSkip;
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                VersionedParcelStream versionedParcelStream = VersionedParcelStream.this;
                int i3 = versionedParcelStream.l;
                if (i3 != -1 && versionedParcelStream.j >= i3) {
                    throw new IOException();
                }
                int i4 = super.read(bArr, i, i2);
                if (i4 > 0) {
                    versionedParcelStream.j += i4;
                }
                return i4;
            }
        }) : null;
        this.d = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.e = dataOutputStream;
        this.f = dataInputStream;
        this.g = dataOutputStream;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a() throws IOException {
        FieldBuffer fieldBuffer = this.h;
        if (fieldBuffer != null) {
            try {
                if (fieldBuffer.f3817a.size() != 0) {
                    FieldBuffer fieldBuffer2 = this.h;
                    DataOutputStream dataOutputStream = fieldBuffer2.d;
                    fieldBuffer2.b.flush();
                    ByteArrayOutputStream byteArrayOutputStream = fieldBuffer2.f3817a;
                    int size = byteArrayOutputStream.size();
                    dataOutputStream.writeInt((fieldBuffer2.c << 16) | (size >= 65535 ? 65535 : size));
                    if (size >= 65535) {
                        dataOutputStream.writeInt(size);
                    }
                    byteArrayOutputStream.writeTo(dataOutputStream);
                }
                this.h = null;
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel b() {
        return new VersionedParcelStream(this.f, this.g, this.f3816a, this.b, this.c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean g() {
        try {
            return this.f.readBoolean();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] h() throws IOException {
        DataInputStream dataInputStream = this.f;
        try {
            int i = dataInputStream.readInt();
            if (i <= 0) {
                return null;
            }
            byte[] bArr = new byte[i];
            dataInputStream.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence i() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean j(int i) throws IOException {
        while (true) {
            try {
                int i2 = this.k;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    break;
                }
                int i3 = this.j;
                int i4 = this.l;
                DataInputStream dataInputStream = this.d;
                if (i3 < i4) {
                    dataInputStream.skip(i4 - i3);
                }
                this.l = -1;
                int i5 = dataInputStream.readInt();
                this.j = 0;
                int i6 = i5 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
                if (i6 == 65535) {
                    i6 = dataInputStream.readInt();
                }
                this.k = (i5 >> 16) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
                this.l = i6;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int k() {
        try {
            return this.f.readInt();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final Parcelable m() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String n() throws IOException {
        DataInputStream dataInputStream = this.f;
        try {
            int i = dataInputStream.readInt();
            if (i <= 0) {
                return null;
            }
            byte[] bArr = new byte[i];
            dataInputStream.readFully(bArr);
            return new String(bArr, m);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void p(int i) throws IOException {
        a();
        FieldBuffer fieldBuffer = new FieldBuffer(i, this.e);
        this.h = fieldBuffer;
        this.g = fieldBuffer.b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void q(boolean z, boolean z2) {
        if (!z) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.i = z2;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void r(boolean z) throws IOException {
        try {
            this.g.writeBoolean(z);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void s(byte[] bArr) throws IOException {
        try {
            if (bArr == null) {
                this.g.writeInt(-1);
            } else {
                this.g.writeInt(bArr.length);
                this.g.write(bArr);
            }
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void t(CharSequence charSequence) {
        if (!this.i) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void u(int i) throws IOException {
        try {
            this.g.writeInt(i);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void w(Parcelable parcelable) {
        if (!this.i) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void x(String str) throws IOException {
        try {
            if (str == null) {
                this.g.writeInt(-1);
                return;
            }
            byte[] bytes = str.getBytes(m);
            this.g.writeInt(bytes.length);
            this.g.write(bytes);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }
}
