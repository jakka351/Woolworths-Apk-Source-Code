package com.woolworths.scanlibrary.models.authentication;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B×\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0004\b\"\u0010#J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\bZJ\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\beJ\t\u0010f\u001a\u00020!HÆ\u0003Jå\u0002\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010 \u001a\u00020!HÆ\u0001J\u0013\u0010h\u001a\u00020i2\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010k\u001a\u00020lHÖ\u0001J\t\u0010m\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u001e\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010%\"\u0004\b<\u0010=R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010%R\u001e\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010%\"\u0004\b@\u0010=R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010%R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010%R\u0016\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010F¨\u0006n"}, d2 = {"Lcom/woolworths/scanlibrary/models/authentication/AuthResponse;", "", "firstname", "", "fulfilmentstoreid", "trolleyhref", "shopperid", "paymenthref", "title", "deliveryaddresssuburb", "deliveryinstructions", "otherphone", "teammember", "deliveryaddressstreet1", "expiresIn", "secondaryphone", "deliveryaddressstreet2", Scopes.EMAIL, "deliverymethod", "dateofbirth", "deliverystoreaddressid", "rewardscardNumber", "primaryphone", "deliverystoreaddresscountry", "lastname", "accessToken", "deliverystoreaddresscity", "refreshToken", "fulfilmenthref", "isservicable", "trolleymergestatus", "profileRewardsNumber", "banner", "Lcom/woolworths/scanlibrary/models/authentication/Banner;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/scanlibrary/models/authentication/Banner;)V", "getFirstname", "()Ljava/lang/String;", "getFulfilmentstoreid", "getTrolleyhref", "getShopperid", "getPaymenthref", "getTitle", "getDeliveryaddresssuburb", "getDeliveryinstructions", "getOtherphone", "getTeammember", "getDeliveryaddressstreet1", "getExpiresIn", "getSecondaryphone", "getDeliveryaddressstreet2", "getEmail", "getDeliverymethod", "getDateofbirth", "getDeliverystoreaddressid", "getRewardscardNumber$scanGoLibrary_release", "getPrimaryphone", "getDeliverystoreaddresscountry", "getLastname", "getAccessToken", "setAccessToken", "(Ljava/lang/String;)V", "getDeliverystoreaddresscity", "getRefreshToken", "setRefreshToken", "getFulfilmenthref", "getIsservicable", "getTrolleymergestatus", "getProfileRewardsNumber$scanGoLibrary_release", "getBanner", "()Lcom/woolworths/scanlibrary/models/authentication/Banner;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component19$scanGoLibrary_release", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component29$scanGoLibrary_release", "component30", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AuthResponse {
    public static final int $stable = 8;

    @SerializedName("access_token")
    @NotNull
    private String accessToken;

    @SerializedName("banner")
    @NotNull
    private final Banner banner;

    @SerializedName("dateofbirth")
    @Nullable
    private final String dateofbirth;

    @SerializedName("deliveryaddressstreet1")
    @Nullable
    private final String deliveryaddressstreet1;

    @SerializedName("deliveryaddressstreet2")
    @Nullable
    private final String deliveryaddressstreet2;

    @SerializedName("deliveryaddresssuburb")
    @Nullable
    private final String deliveryaddresssuburb;

    @SerializedName("deliveryinstructions")
    @Nullable
    private final String deliveryinstructions;

    @SerializedName("deliverymethod")
    @Nullable
    private final String deliverymethod;

    @SerializedName("deliverystoreaddresscity")
    @Nullable
    private final String deliverystoreaddresscity;

    @SerializedName("deliverystoreaddresscountry")
    @Nullable
    private final String deliverystoreaddresscountry;

    @SerializedName("deliverystoreaddressid")
    @Nullable
    private final String deliverystoreaddressid;

    @SerializedName(Scopes.EMAIL)
    @NotNull
    private final String email;

    @SerializedName("expires_in")
    @Nullable
    private final String expiresIn;

    @SerializedName("firstname")
    @NotNull
    private final String firstname;

    @SerializedName("fulfilmenthref")
    @Nullable
    private final String fulfilmenthref;

    @SerializedName("fulfilmentstoreid")
    @Nullable
    private final String fulfilmentstoreid;

    @SerializedName("isservicable")
    @Nullable
    private final String isservicable;

    @SerializedName("lastname")
    @NotNull
    private final String lastname;

    @SerializedName("otherphone")
    @Nullable
    private final String otherphone;

    @SerializedName("paymenthref")
    @Nullable
    private final String paymenthref;

    @SerializedName("primaryphone")
    @Nullable
    private final String primaryphone;

    @SerializedName("rewardcardnumber")
    @Nullable
    private final String profileRewardsNumber;

    @SerializedName("refresh_token")
    @NotNull
    private String refreshToken;

    @SerializedName("rewardscardNumber")
    @Nullable
    private final String rewardscardNumber;

    @SerializedName("secondaryphone")
    @Nullable
    private final String secondaryphone;

    @SerializedName("shopperid")
    @Nullable
    private final String shopperid;

    @SerializedName("teammember")
    @Nullable
    private final String teammember;

    @SerializedName("title")
    @Nullable
    private final String title;

    @SerializedName("trolleyhref")
    @Nullable
    private final String trolleyhref;

    @SerializedName("trolleymergestatus")
    @Nullable
    private final String trolleymergestatus;

    public AuthResponse(@NotNull String firstname, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @NotNull String email, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @NotNull String lastname, @NotNull String accessToken, @Nullable String str20, @NotNull String refreshToken, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @NotNull Banner banner) {
        Intrinsics.h(firstname, "firstname");
        Intrinsics.h(email, "email");
        Intrinsics.h(lastname, "lastname");
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(refreshToken, "refreshToken");
        Intrinsics.h(banner, "banner");
        this.firstname = firstname;
        this.fulfilmentstoreid = str;
        this.trolleyhref = str2;
        this.shopperid = str3;
        this.paymenthref = str4;
        this.title = str5;
        this.deliveryaddresssuburb = str6;
        this.deliveryinstructions = str7;
        this.otherphone = str8;
        this.teammember = str9;
        this.deliveryaddressstreet1 = str10;
        this.expiresIn = str11;
        this.secondaryphone = str12;
        this.deliveryaddressstreet2 = str13;
        this.email = email;
        this.deliverymethod = str14;
        this.dateofbirth = str15;
        this.deliverystoreaddressid = str16;
        this.rewardscardNumber = str17;
        this.primaryphone = str18;
        this.deliverystoreaddresscountry = str19;
        this.lastname = lastname;
        this.accessToken = accessToken;
        this.deliverystoreaddresscity = str20;
        this.refreshToken = refreshToken;
        this.fulfilmenthref = str21;
        this.isservicable = str22;
        this.trolleymergestatus = str23;
        this.profileRewardsNumber = str24;
        this.banner = banner;
    }

    public static /* synthetic */ AuthResponse copy$default(AuthResponse authResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, Banner banner, int i, Object obj) {
        Banner banner2;
        String str30;
        String str31 = (i & 1) != 0 ? authResponse.firstname : str;
        String str32 = (i & 2) != 0 ? authResponse.fulfilmentstoreid : str2;
        String str33 = (i & 4) != 0 ? authResponse.trolleyhref : str3;
        String str34 = (i & 8) != 0 ? authResponse.shopperid : str4;
        String str35 = (i & 16) != 0 ? authResponse.paymenthref : str5;
        String str36 = (i & 32) != 0 ? authResponse.title : str6;
        String str37 = (i & 64) != 0 ? authResponse.deliveryaddresssuburb : str7;
        String str38 = (i & 128) != 0 ? authResponse.deliveryinstructions : str8;
        String str39 = (i & 256) != 0 ? authResponse.otherphone : str9;
        String str40 = (i & 512) != 0 ? authResponse.teammember : str10;
        String str41 = (i & 1024) != 0 ? authResponse.deliveryaddressstreet1 : str11;
        String str42 = (i & 2048) != 0 ? authResponse.expiresIn : str12;
        String str43 = (i & 4096) != 0 ? authResponse.secondaryphone : str13;
        String str44 = (i & 8192) != 0 ? authResponse.deliveryaddressstreet2 : str14;
        String str45 = str31;
        String str46 = (i & 16384) != 0 ? authResponse.email : str15;
        String str47 = (i & 32768) != 0 ? authResponse.deliverymethod : str16;
        String str48 = (i & 65536) != 0 ? authResponse.dateofbirth : str17;
        String str49 = (i & 131072) != 0 ? authResponse.deliverystoreaddressid : str18;
        String str50 = (i & 262144) != 0 ? authResponse.rewardscardNumber : str19;
        String str51 = (i & 524288) != 0 ? authResponse.primaryphone : str20;
        String str52 = (i & 1048576) != 0 ? authResponse.deliverystoreaddresscountry : str21;
        String str53 = (i & 2097152) != 0 ? authResponse.lastname : str22;
        String str54 = (i & 4194304) != 0 ? authResponse.accessToken : str23;
        String str55 = (i & 8388608) != 0 ? authResponse.deliverystoreaddresscity : str24;
        String str56 = (i & 16777216) != 0 ? authResponse.refreshToken : str25;
        String str57 = (i & 33554432) != 0 ? authResponse.fulfilmenthref : str26;
        String str58 = (i & 67108864) != 0 ? authResponse.isservicable : str27;
        String str59 = (i & 134217728) != 0 ? authResponse.trolleymergestatus : str28;
        String str60 = (i & 268435456) != 0 ? authResponse.profileRewardsNumber : str29;
        if ((i & 536870912) != 0) {
            str30 = str60;
            banner2 = authResponse.banner;
        } else {
            banner2 = banner;
            str30 = str60;
        }
        return authResponse.copy(str45, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str30, banner2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFirstname() {
        return this.firstname;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getTeammember() {
        return this.teammember;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getDeliveryaddressstreet1() {
        return this.deliveryaddressstreet1;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getSecondaryphone() {
        return this.secondaryphone;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getDeliveryaddressstreet2() {
        return this.deliveryaddressstreet2;
    }

    @NotNull
    /* renamed from: component15, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getDeliverymethod() {
        return this.deliverymethod;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getDateofbirth() {
        return this.dateofbirth;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getDeliverystoreaddressid() {
        return this.deliverystoreaddressid;
    }

    @Nullable
    /* renamed from: component19$scanGoLibrary_release, reason: from getter */
    public final String getRewardscardNumber() {
        return this.rewardscardNumber;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getFulfilmentstoreid() {
        return this.fulfilmentstoreid;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getPrimaryphone() {
        return this.primaryphone;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final String getDeliverystoreaddresscountry() {
        return this.deliverystoreaddresscountry;
    }

    @NotNull
    /* renamed from: component22, reason: from getter */
    public final String getLastname() {
        return this.lastname;
    }

    @NotNull
    /* renamed from: component23, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final String getDeliverystoreaddresscity() {
        return this.deliverystoreaddresscity;
    }

    @NotNull
    /* renamed from: component25, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final String getFulfilmenthref() {
        return this.fulfilmenthref;
    }

    @Nullable
    /* renamed from: component27, reason: from getter */
    public final String getIsservicable() {
        return this.isservicable;
    }

    @Nullable
    /* renamed from: component28, reason: from getter */
    public final String getTrolleymergestatus() {
        return this.trolleymergestatus;
    }

    @Nullable
    /* renamed from: component29$scanGoLibrary_release, reason: from getter */
    public final String getProfileRewardsNumber() {
        return this.profileRewardsNumber;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTrolleyhref() {
        return this.trolleyhref;
    }

    @NotNull
    /* renamed from: component30, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getShopperid() {
        return this.shopperid;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPaymenthref() {
        return this.paymenthref;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getDeliveryaddresssuburb() {
        return this.deliveryaddresssuburb;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getDeliveryinstructions() {
        return this.deliveryinstructions;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getOtherphone() {
        return this.otherphone;
    }

    @NotNull
    public final AuthResponse copy(@NotNull String firstname, @Nullable String fulfilmentstoreid, @Nullable String trolleyhref, @Nullable String shopperid, @Nullable String paymenthref, @Nullable String title, @Nullable String deliveryaddresssuburb, @Nullable String deliveryinstructions, @Nullable String otherphone, @Nullable String teammember, @Nullable String deliveryaddressstreet1, @Nullable String expiresIn, @Nullable String secondaryphone, @Nullable String deliveryaddressstreet2, @NotNull String email, @Nullable String deliverymethod, @Nullable String dateofbirth, @Nullable String deliverystoreaddressid, @Nullable String rewardscardNumber, @Nullable String primaryphone, @Nullable String deliverystoreaddresscountry, @NotNull String lastname, @NotNull String accessToken, @Nullable String deliverystoreaddresscity, @NotNull String refreshToken, @Nullable String fulfilmenthref, @Nullable String isservicable, @Nullable String trolleymergestatus, @Nullable String profileRewardsNumber, @NotNull Banner banner) {
        Intrinsics.h(firstname, "firstname");
        Intrinsics.h(email, "email");
        Intrinsics.h(lastname, "lastname");
        Intrinsics.h(accessToken, "accessToken");
        Intrinsics.h(refreshToken, "refreshToken");
        Intrinsics.h(banner, "banner");
        return new AuthResponse(firstname, fulfilmentstoreid, trolleyhref, shopperid, paymenthref, title, deliveryaddresssuburb, deliveryinstructions, otherphone, teammember, deliveryaddressstreet1, expiresIn, secondaryphone, deliveryaddressstreet2, email, deliverymethod, dateofbirth, deliverystoreaddressid, rewardscardNumber, primaryphone, deliverystoreaddresscountry, lastname, accessToken, deliverystoreaddresscity, refreshToken, fulfilmenthref, isservicable, trolleymergestatus, profileRewardsNumber, banner);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthResponse)) {
            return false;
        }
        AuthResponse authResponse = (AuthResponse) other;
        return Intrinsics.c(this.firstname, authResponse.firstname) && Intrinsics.c(this.fulfilmentstoreid, authResponse.fulfilmentstoreid) && Intrinsics.c(this.trolleyhref, authResponse.trolleyhref) && Intrinsics.c(this.shopperid, authResponse.shopperid) && Intrinsics.c(this.paymenthref, authResponse.paymenthref) && Intrinsics.c(this.title, authResponse.title) && Intrinsics.c(this.deliveryaddresssuburb, authResponse.deliveryaddresssuburb) && Intrinsics.c(this.deliveryinstructions, authResponse.deliveryinstructions) && Intrinsics.c(this.otherphone, authResponse.otherphone) && Intrinsics.c(this.teammember, authResponse.teammember) && Intrinsics.c(this.deliveryaddressstreet1, authResponse.deliveryaddressstreet1) && Intrinsics.c(this.expiresIn, authResponse.expiresIn) && Intrinsics.c(this.secondaryphone, authResponse.secondaryphone) && Intrinsics.c(this.deliveryaddressstreet2, authResponse.deliveryaddressstreet2) && Intrinsics.c(this.email, authResponse.email) && Intrinsics.c(this.deliverymethod, authResponse.deliverymethod) && Intrinsics.c(this.dateofbirth, authResponse.dateofbirth) && Intrinsics.c(this.deliverystoreaddressid, authResponse.deliverystoreaddressid) && Intrinsics.c(this.rewardscardNumber, authResponse.rewardscardNumber) && Intrinsics.c(this.primaryphone, authResponse.primaryphone) && Intrinsics.c(this.deliverystoreaddresscountry, authResponse.deliverystoreaddresscountry) && Intrinsics.c(this.lastname, authResponse.lastname) && Intrinsics.c(this.accessToken, authResponse.accessToken) && Intrinsics.c(this.deliverystoreaddresscity, authResponse.deliverystoreaddresscity) && Intrinsics.c(this.refreshToken, authResponse.refreshToken) && Intrinsics.c(this.fulfilmenthref, authResponse.fulfilmenthref) && Intrinsics.c(this.isservicable, authResponse.isservicable) && Intrinsics.c(this.trolleymergestatus, authResponse.trolleymergestatus) && Intrinsics.c(this.profileRewardsNumber, authResponse.profileRewardsNumber) && this.banner == authResponse.banner;
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final Banner getBanner() {
        return this.banner;
    }

    @Nullable
    public final String getDateofbirth() {
        return this.dateofbirth;
    }

    @Nullable
    public final String getDeliveryaddressstreet1() {
        return this.deliveryaddressstreet1;
    }

    @Nullable
    public final String getDeliveryaddressstreet2() {
        return this.deliveryaddressstreet2;
    }

    @Nullable
    public final String getDeliveryaddresssuburb() {
        return this.deliveryaddresssuburb;
    }

    @Nullable
    public final String getDeliveryinstructions() {
        return this.deliveryinstructions;
    }

    @Nullable
    public final String getDeliverymethod() {
        return this.deliverymethod;
    }

    @Nullable
    public final String getDeliverystoreaddresscity() {
        return this.deliverystoreaddresscity;
    }

    @Nullable
    public final String getDeliverystoreaddresscountry() {
        return this.deliverystoreaddresscountry;
    }

    @Nullable
    public final String getDeliverystoreaddressid() {
        return this.deliverystoreaddressid;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    public final String getFirstname() {
        return this.firstname;
    }

    @Nullable
    public final String getFulfilmenthref() {
        return this.fulfilmenthref;
    }

    @Nullable
    public final String getFulfilmentstoreid() {
        return this.fulfilmentstoreid;
    }

    @Nullable
    public final String getIsservicable() {
        return this.isservicable;
    }

    @NotNull
    public final String getLastname() {
        return this.lastname;
    }

    @Nullable
    public final String getOtherphone() {
        return this.otherphone;
    }

    @Nullable
    public final String getPaymenthref() {
        return this.paymenthref;
    }

    @Nullable
    public final String getPrimaryphone() {
        return this.primaryphone;
    }

    @Nullable
    public final String getProfileRewardsNumber$scanGoLibrary_release() {
        return this.profileRewardsNumber;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    public final String getRewardscardNumber$scanGoLibrary_release() {
        return this.rewardscardNumber;
    }

    @Nullable
    public final String getSecondaryphone() {
        return this.secondaryphone;
    }

    @Nullable
    public final String getShopperid() {
        return this.shopperid;
    }

    @Nullable
    public final String getTeammember() {
        return this.teammember;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTrolleyhref() {
        return this.trolleyhref;
    }

    @Nullable
    public final String getTrolleymergestatus() {
        return this.trolleymergestatus;
    }

    public int hashCode() {
        int iHashCode = this.firstname.hashCode() * 31;
        String str = this.fulfilmentstoreid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trolleyhref;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shopperid;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.paymenthref;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deliveryaddresssuburb;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deliveryinstructions;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.otherphone;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.teammember;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.deliveryaddressstreet1;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.expiresIn;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.secondaryphone;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.deliveryaddressstreet2;
        int iC = b.c((iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31, 31, this.email);
        String str14 = this.deliverymethod;
        int iHashCode14 = (iC + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.dateofbirth;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.deliverystoreaddressid;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.rewardscardNumber;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.primaryphone;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.deliverystoreaddresscountry;
        int iC2 = b.c(b.c((iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31, 31, this.lastname), 31, this.accessToken);
        String str20 = this.deliverystoreaddresscity;
        int iC3 = b.c((iC2 + (str20 == null ? 0 : str20.hashCode())) * 31, 31, this.refreshToken);
        String str21 = this.fulfilmenthref;
        int iHashCode19 = (iC3 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.isservicable;
        int iHashCode20 = (iHashCode19 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.trolleymergestatus;
        int iHashCode21 = (iHashCode20 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.profileRewardsNumber;
        return this.banner.hashCode() + ((iHashCode21 + (str24 != null ? str24.hashCode() : 0)) * 31);
    }

    public final void setAccessToken(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.accessToken = str;
    }

    public final void setRefreshToken(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.refreshToken = str;
    }

    @NotNull
    public String toString() {
        String str = this.firstname;
        String str2 = this.fulfilmentstoreid;
        String str3 = this.trolleyhref;
        String str4 = this.shopperid;
        String str5 = this.paymenthref;
        String str6 = this.title;
        String str7 = this.deliveryaddresssuburb;
        String str8 = this.deliveryinstructions;
        String str9 = this.otherphone;
        String str10 = this.teammember;
        String str11 = this.deliveryaddressstreet1;
        String str12 = this.expiresIn;
        String str13 = this.secondaryphone;
        String str14 = this.deliveryaddressstreet2;
        String str15 = this.email;
        String str16 = this.deliverymethod;
        String str17 = this.dateofbirth;
        String str18 = this.deliverystoreaddressid;
        String str19 = this.rewardscardNumber;
        String str20 = this.primaryphone;
        String str21 = this.deliverystoreaddresscountry;
        String str22 = this.lastname;
        String str23 = this.accessToken;
        String str24 = this.deliverystoreaddresscity;
        String str25 = this.refreshToken;
        String str26 = this.fulfilmenthref;
        String str27 = this.isservicable;
        String str28 = this.trolleymergestatus;
        String str29 = this.profileRewardsNumber;
        Banner banner = this.banner;
        StringBuilder sbV = a.v("AuthResponse(firstname=", str, ", fulfilmentstoreid=", str2, ", trolleyhref=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", shopperid=", str4, ", paymenthref=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", title=", str6, ", deliveryaddresssuburb=");
        androidx.constraintlayout.core.state.a.B(sbV, str7, ", deliveryinstructions=", str8, ", otherphone=");
        androidx.constraintlayout.core.state.a.B(sbV, str9, ", teammember=", str10, ", deliveryaddressstreet1=");
        androidx.constraintlayout.core.state.a.B(sbV, str11, ", expiresIn=", str12, ", secondaryphone=");
        androidx.constraintlayout.core.state.a.B(sbV, str13, ", deliveryaddressstreet2=", str14, ", email=");
        androidx.constraintlayout.core.state.a.B(sbV, str15, ", deliverymethod=", str16, ", dateofbirth=");
        androidx.constraintlayout.core.state.a.B(sbV, str17, ", deliverystoreaddressid=", str18, ", rewardscardNumber=");
        androidx.constraintlayout.core.state.a.B(sbV, str19, ", primaryphone=", str20, ", deliverystoreaddresscountry=");
        androidx.constraintlayout.core.state.a.B(sbV, str21, ", lastname=", str22, ", accessToken=");
        androidx.constraintlayout.core.state.a.B(sbV, str23, ", deliverystoreaddresscity=", str24, ", refreshToken=");
        androidx.constraintlayout.core.state.a.B(sbV, str25, ", fulfilmenthref=", str26, ", isservicable=");
        androidx.constraintlayout.core.state.a.B(sbV, str27, ", trolleymergestatus=", str28, ", profileRewardsNumber=");
        sbV.append(str29);
        sbV.append(", banner=");
        sbV.append(banner);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ AuthResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, Banner banner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, str15, (32768 & i) != 0 ? null : str16, (65536 & i) != 0 ? null : str17, (131072 & i) != 0 ? null : str18, (262144 & i) != 0 ? null : str19, (524288 & i) != 0 ? null : str20, (1048576 & i) != 0 ? null : str21, str22, str23, (8388608 & i) != 0 ? null : str24, str25, (33554432 & i) != 0 ? null : str26, (67108864 & i) != 0 ? null : str27, (134217728 & i) != 0 ? null : str28, (i & 268435456) != 0 ? null : str29, banner);
    }
}
