package com.google.firebase.firestore.local;

import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.util.Consumer;

/* loaded from: classes6.dex */
public final /* synthetic */ class k implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15523a;
    public final /* synthetic */ LruGarbageCollector.RollingSequenceNumberBuffer b;

    public /* synthetic */ k(LruGarbageCollector.RollingSequenceNumberBuffer rollingSequenceNumberBuffer, int i) {
        this.f15523a = i;
        this.b = rollingSequenceNumberBuffer;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        int i = this.f15523a;
        LruGarbageCollector.RollingSequenceNumberBuffer rollingSequenceNumberBuffer = this.b;
        switch (i) {
            case 0:
                int i2 = LruGarbageCollector.d;
                rollingSequenceNumberBuffer.a(Long.valueOf(((TargetData) obj).c));
                break;
            default:
                rollingSequenceNumberBuffer.a((Long) obj);
                break;
        }
    }
}
