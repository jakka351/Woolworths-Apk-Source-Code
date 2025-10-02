package me.oriient.internal.services.uploadingManager;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.uploadingManager.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1514c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C1536n f25630a;
    public Iterator b;
    public String c;
    public double d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ C1536n g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1514c(C1536n c1536n, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = c1536n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return C1536n.a(this.g, 0.0d, this);
    }
}
