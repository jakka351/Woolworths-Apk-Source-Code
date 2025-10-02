package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;

/* loaded from: classes6.dex */
public final class LocalViewChanges {

    /* renamed from: a, reason: collision with root package name */
    public final int f15489a;
    public final boolean b;
    public final ImmutableSortedSet c;
    public final ImmutableSortedSet d;

    /* renamed from: com.google.firebase.firestore.local.LocalViewChanges$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15490a;

        static {
            int[] iArr = new int[DocumentViewChange.Type.values().length];
            f15490a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15490a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LocalViewChanges(int i, boolean z, ImmutableSortedSet immutableSortedSet, ImmutableSortedSet immutableSortedSet2) {
        this.f15489a = i;
        this.b = z;
        this.c = immutableSortedSet;
        this.d = immutableSortedSet2;
    }
}
