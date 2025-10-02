package com.google.firebase.crashlytics.internal.breadcrumbs;

import com.google.firebase.crashlytics.internal.Logger;

/* loaded from: classes.dex */
public class DisabledBreadcrumbSource implements BreadcrumbSource {
    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public final void a(BreadcrumbHandler breadcrumbHandler) {
        Logger.f15258a.b("Could not register handler for breadcrumbs events.", null);
    }
}
