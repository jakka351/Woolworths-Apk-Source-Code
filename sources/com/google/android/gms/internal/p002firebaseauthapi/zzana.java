package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.camera.core.impl.b;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zzana<E> extends zzajp<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzana<Object> zzb;
    private E[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzana<>(objArr, 0, false);
    }

    public zzana() {
        this(zza, 0, true);
    }

    private static int zzb(int i) {
        return c.d(i, 3, 2, 1, 10);
    }

    private final String zzc(int i) {
        return b.i(i, this.zzd, "Index:", ", Size:");
    }

    public static <E> zzana<E> zzd() {
        return (zzana<E>) zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
        E[] eArr = this.zzc;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[zzb(eArr.length)];
            System.arraycopy(this.zzc, 0, eArr2, 0, i);
            System.arraycopy(this.zzc, i, eArr2, i + 1, this.zzd - i);
            this.zzc = eArr2;
        }
        this.zzc[i] = e;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzd(i);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zza();
        zzd(i);
        E[] eArr = this.zzc;
        E e = eArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zza();
        zzd(i);
        E[] eArr = this.zzc;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
    public final /* synthetic */ zzalm zza(int i) {
        if (i >= this.zzd) {
            return new zzana(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzana(E[] eArr, int i, boolean z) {
        super(z);
        this.zzc = eArr;
        this.zzd = i;
    }

    private final void zzd(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajp, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zza();
        int i = this.zzd;
        E[] eArr = this.zzc;
        if (i == eArr.length) {
            this.zzc = (E[]) Arrays.copyOf(this.zzc, zzb(eArr.length));
        }
        E[] eArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
