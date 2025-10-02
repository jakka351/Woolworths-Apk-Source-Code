package com.skydoves.balloon;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/skydoves/balloon/TextForm;", "", "Builder", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextForm {

    /* renamed from: a, reason: collision with root package name */
    public final String f19016a;
    public final float b;
    public final int c;
    public final int d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/skydoves/balloon/TextForm$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @TextFormDsl
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f19017a;
        public float b;
        public int c;
        public int d;

        public Builder(@NotNull Context context) {
            Intrinsics.h(context, "context");
            this.f19017a = "";
            this.b = 12.0f;
            this.c = -1;
            this.d = 17;
        }
    }

    public TextForm(Builder builder) {
        this.f19016a = builder.f19017a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }
}
