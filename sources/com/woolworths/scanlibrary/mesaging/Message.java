package com.woolworths.scanlibrary.mesaging;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/woolworths/scanlibrary/mesaging/Message;", "", "Lcom/woolworths/scanlibrary/mesaging/BagCheckCompletedEvent;", "Lcom/woolworths/scanlibrary/mesaging/ExpiredCart;", "Lcom/woolworths/scanlibrary/mesaging/ExpiringCart;", "Lcom/woolworths/scanlibrary/mesaging/LogoutEvent;", "Lcom/woolworths/scanlibrary/mesaging/ParkingVoucherReadyEvent;", "Lcom/woolworths/scanlibrary/mesaging/TransferredToPOSEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class Message {

    /* renamed from: a, reason: collision with root package name */
    public final Map f21210a;

    public Message(Map map) {
        this.f21210a = map;
    }

    public abstract int a();

    public abstract void b();

    public abstract boolean c();
}
