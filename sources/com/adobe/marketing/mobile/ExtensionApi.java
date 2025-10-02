package com.adobe.marketing.mobile;

import au.com.woolworths.product.details.b;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ExtensionApi {
    public abstract SharedStateResolver a(Event event);

    public abstract void b(Map map, Event event);

    public abstract void c(Event event);

    public abstract void d(EventHistoryRequest[] eventHistoryRequestArr, boolean z, b bVar);

    public abstract SharedStateResult e(String str, Event event, SharedStateResolution sharedStateResolution);

    public abstract void f(String str, String str2, ExtensionEventListener extensionEventListener);

    public abstract void g();

    public abstract void h();
}
