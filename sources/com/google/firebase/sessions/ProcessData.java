package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/sessions/ProcessData;", "", "Companion", "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class ProcessData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final int f15806a;
    public final String b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/ProcessData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/google/firebase/sessions/ProcessData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ProcessData> serializer() {
            return ProcessData$$serializer.f15807a;
        }
    }

    public /* synthetic */ ProcessData(int i, int i2, String str) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, ProcessData$$serializer.f15807a.getB());
            throw null;
        }
        this.f15806a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessData)) {
            return false;
        }
        ProcessData processData = (ProcessData) obj;
        return this.f15806a == processData.f15806a && Intrinsics.c(this.b, processData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f15806a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.f15806a);
        sb.append(", uuid=");
        return androidx.camera.core.impl.b.r(sb, this.b, ')');
    }

    public ProcessData(int i, String uuid) {
        Intrinsics.h(uuid, "uuid");
        this.f15806a = i;
        this.b = uuid;
    }
}
