package com.woolworths.scanlibrary.util.event;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/util/event/Event;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class Event<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21367a;
    public boolean b;

    public Event(Object obj) {
        this.f21367a = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.f21367a;
    }
}
