package com.woolworths.scanlibrary.di.user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.models.user.User;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/di/user/UserModule;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes7.dex */
public final class UserModule {

    /* renamed from: a, reason: collision with root package name */
    public final User f21168a;

    public UserModule(User authenticatedUser) {
        Intrinsics.h(authenticatedUser, "authenticatedUser");
        this.f21168a = authenticatedUser;
    }
}
