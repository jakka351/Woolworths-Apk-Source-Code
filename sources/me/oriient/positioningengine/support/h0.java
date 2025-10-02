package me.oriient.positioningengine.support;

import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.positioningengine.common.PositioningEngine;

/* loaded from: classes8.dex */
public final class h0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public j0 f26554a;
    public PositioningEngine b;
    public List c;
    public HashMap d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ j0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.j = j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, 0L, null, false, false, false, false, false, null, this);
    }
}
