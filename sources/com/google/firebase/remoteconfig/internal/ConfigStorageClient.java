package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.AnyThread;
import java.util.HashMap;

@AnyThread
/* loaded from: classes.dex */
public class ConfigStorageClient {
    public static final HashMap c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f15773a;
    public final String b;

    public ConfigStorageClient(Context context, String str) {
        this.f15773a = context;
        this.b = str;
    }
}
