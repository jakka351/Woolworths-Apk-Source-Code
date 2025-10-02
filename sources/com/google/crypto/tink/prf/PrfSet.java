package com.google.crypto.tink.prf;

import com.google.errorprone.annotations.Immutable;
import java.util.Map;

@Immutable
/* loaded from: classes.dex */
public abstract class PrfSet {
    public abstract Map a();

    public abstract int b();
}
