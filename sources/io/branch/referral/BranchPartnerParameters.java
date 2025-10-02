package io.branch.referral;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class BranchPartnerParameters {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f23854a = new ConcurrentHashMap();

    static {
        Pattern.compile("\\p{XDigit}+");
    }
}
