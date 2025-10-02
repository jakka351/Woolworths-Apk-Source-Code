package com.airbnb.deeplinkdispatch;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/airbnb/deeplinkdispatch/NodeMetadata;", "", "Companion", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NodeMetadata {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13296a;
    public final boolean b;
    public final boolean c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/deeplinkdispatch/NodeMetadata$Companion;", "", "", "zero", "B", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public NodeMetadata(byte b) {
        boolean z = false;
        boolean z2 = ((byte) (b & 16)) != 0;
        this.f13296a = z2;
        boolean z3 = ((byte) (b & 32)) != 0;
        this.b = z3;
        if (!z2 && !z3) {
            z = true;
        }
        this.c = z;
    }
}
