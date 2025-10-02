package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class MultiFactorInfo extends AbstractSafeParcelable {
    public abstract String d();

    public abstract JSONObject toJson();
}
