package com.caverock.androidsvg;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class SimpleAssetResolver extends SVGExternalFileResolver {
    static {
        HashSet hashSet = new HashSet(8);
        a.A(hashSet, "image/svg+xml", "image/jpeg", "image/png", "image/pjpeg");
        a.A(hashSet, "image/gif", "image/bmp", "image/x-windows-bmp", "image/webp");
    }
}
