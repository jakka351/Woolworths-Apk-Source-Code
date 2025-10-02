package au.com.woolworths.android.onesite.deeplink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLinkDispatchDefinition;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.k;
import com.woolworths.R;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bV\bÆ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\bJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\bJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\bJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\bJ\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\bJ\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\bJ\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\bJ\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\bJ\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\bJ\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\bJ\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\bJ\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\bJ\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\bJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\bJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\bJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\bJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\bJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\bJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\bJ\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010\bJ\u001f\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010\bJ\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010\bJ\u001f\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010\bJ\u001f\u0010'\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010\bJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010\bJ\u001f\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010\bJ\u001f\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010\bJ\u001f\u0010+\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010\bJ\u001f\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b,\u0010\bJ\u001f\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010\bJ\u001f\u0010.\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b.\u0010\bJ\u001f\u0010/\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b/\u0010\bJ\u001f\u00100\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b0\u0010\bJ\u001f\u00101\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b1\u0010\bJ\u001f\u00102\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b2\u0010\bJ\u001f\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b3\u0010\bJ\u001f\u00104\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b4\u0010\bJ\u001f\u00105\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b5\u0010\bJ\u001f\u00106\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b6\u0010\bJ\u001f\u00107\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b7\u0010\bJ\u001f\u00108\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b8\u0010\bJ\u001f\u00109\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b9\u0010\bJ\u001f\u0010:\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b:\u0010\bJ\u001f\u0010;\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b;\u0010\bJ\u001f\u0010<\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b<\u0010\bJ\u001f\u0010=\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b=\u0010\bJ\u001f\u0010>\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b>\u0010\bJ\u001f\u0010?\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b?\u0010\bJ\u001f\u0010@\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b@\u0010\bJ\u001f\u0010A\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bA\u0010\bJ\u001f\u0010B\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bB\u0010\bJ\u001f\u0010C\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bC\u0010\bJ\u001f\u0010D\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bD\u0010\bJ\u001f\u0010E\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bE\u0010\bJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bF\u0010\bJ\u001f\u0010G\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bG\u0010\bJ\u001f\u0010H\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bH\u0010\bJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bI\u0010\bJ\u001f\u0010J\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bJ\u0010\bJ\u001f\u0010K\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bK\u0010\bJ\u001f\u0010L\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bL\u0010\bJ\u001f\u0010M\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bM\u0010\bJ\u001f\u0010N\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bN\u0010\bJ\u001f\u0010O\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bO\u0010\bJ\u001f\u0010P\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bP\u0010\bJ\u001f\u0010Q\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bQ\u0010\bJ\u001f\u0010R\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bR\u0010\bJ\u001f\u0010S\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bS\u0010\bJ\u001f\u0010T\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bT\u0010\bJ\u001f\u0010U\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bU\u0010\bJ\u001f\u0010V\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bV\u0010\bJ\u001f\u0010W\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bW\u0010\bJ\u001f\u0010X\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bX\u0010\bJ\u001f\u0010Y\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bY\u0010\bJ\u001f\u0010Z\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bZ\u0010\bJ\u001f\u0010[\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b[\u0010\b¨\u0006\\"}, d2 = {"Lau/com/woolworths/android/onesite/deeplink/ShopAppDeepLinkDispatchDefinition;", "", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "extras", "Landroid/content/Intent;", "intentForBrandedShop", "(Landroid/content/Context;Landroid/os/Bundle;)Landroid/content/Intent;", "intentForCatalogueHome", "intentForCataloguePromotionDetails", "taskStackForDeliveryUnlimited", "intentForFeedbackForm", "intentForFreshMagHome", "intentForHome", "intentForInStoreWifi", "taskStackForLists", "taskStackForSuggestedLists", "taskStackForSuggestedList", "taskStackForBoostedOffers", "taskStackForWatchlist", "intentForShopAppLogin", "taskStackForDynamicPage", "intentForMoreTab", "intentForOfferDetails", "intentForOlive", "intentForProductCategory", "intentForProductsTab", "intentForPromotions", "intentForEreceiptDetails", "intentForProductFinder", "intentForVoiceProductFinder", "intentForVoiceProductSearch", "intentForMyEReceipts", "intentForRecipeDetails", "intentForRecipesHome", "intentForRecipeFeed", "intentForSavedRecipes", "intentForRecipesSearch", "intentForAddRewards", "intentForRewardsBoosters", "intentForRewardsLogin", "intentForRewardsSignup", "intentForBottomSheet", "intentForScanAndGo", "intentForSngParkingVoucher", "intentForShopAppSignup", "intentForSpecialsTab", "intentForSpecials", "intentForStoreSelector", "intentForSelectingAddress", "intentForAddingAddress", "intentForWebView", "intentForAuthenticatedWebView", "intentForProductDetails", "intentForStoreDetails", "intentForOrders", "intentForOrdersProducts", "intentForNotificationPreferences", "intentForBuyAgain", "intentForFulfilmentWindowSelection", "intentForShoppingModeSelection", "intentForHealthyLifeFoodTracker", "intentForMarketplace", "intentForSellerRangeDiscovery", "intentForShippingCalculator", "intentForCopyToClipboardAction", "intentForInbox", "intentForNotificationOptIn", "intentForPickupStoreSelection", "intentForHomeInstoreMode", "intentForGuidePage", "intentForArticlePage", "intentForIdeaPage", "intentForVideoPage", "intentForContentPlaybook", "intentForAboutPage", "intentForEverydayPage", "intentForEventPage", "intentForHelpPage", "intentForServicePage", "intentForCategoryAndEventsPage", "intentForBundlesActivity", "intentForEverydayExtraSignUp", "intentForCart", "intentForRatingsAndReviewsDetails", "intentForSubmitReviews", "intentForProductGroup", "intentForPastShop", "intentForProductGroupUniversalLink", "intentForCheckout", "intentForRewardsOffer", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShopAppDeepLinkDispatchDefinition {

    /* renamed from: a, reason: collision with root package name */
    public static final ShopAppDeepLinkDispatchDefinition f4243a = new ShopAppDeepLinkDispatchDefinition();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4244a;

        static {
            int[] iArr = new int[Activities.ProductSubCategory.ProductCategoryType.values().length];
            try {
                Activities.ProductSubCategory.ProductCategoryType productCategoryType = Activities.ProductSubCategory.ProductCategoryType.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4244a = iArr;
        }
    }

    public static Intent a(Bundle extras, Function0 intentInitializer) {
        Intrinsics.h(extras, "extras");
        Intrinsics.h(intentInitializer, "intentInitializer");
        DeepLinkConfig deepLinkConfig = (DeepLinkConfig) extras.getParcelable("ShopAppDeepLink.Extras.config");
        if (deepLinkConfig != null ? deepLinkConfig.e : false) {
            DeepLinkConfig deepLinkConfig2 = (DeepLinkConfig) extras.getParcelable("ShopAppDeepLink.Extras.config");
            if (deepLinkConfig2 != null ? deepLinkConfig2.h : false) {
                DeepLinkConfig deepLinkConfig3 = (DeepLinkConfig) extras.getParcelable("ShopAppDeepLink.Extras.config");
                if (!(deepLinkConfig3 != null ? deepLinkConfig3.i : false)) {
                    return (Intent) intentInitializer.invoke();
                }
            }
        }
        Intent intentPutExtra = ActivityNavigatorKt.a(Activities.ShopAppSplash.f4530a, ApplicationType.e).putExtra("ShopAppDeepLink.Extras.deferredIntent", (Parcelable) intentInitializer.invoke());
        Intrinsics.e(intentPutExtra);
        return intentPutExtra;
    }

    public static Intent b(Bundle bundle, Function0 function0) {
        Intent intentA;
        DeepLinkConfig deepLinkConfig = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
        String str = deepLinkConfig != null ? deepLinkConfig.d : null;
        DeepLinkConfig deepLinkConfig2 = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
        if (deepLinkConfig2 != null ? deepLinkConfig2.f : false) {
            intentA = (Intent) function0.invoke();
        } else {
            boolean z = str == null || StringsKt.D(str);
            Activities.LogIn logIn = Activities.LogIn.f4485a;
            intentA = z ? ActivityNavigatorKt.a(logIn, ApplicationType.e) : logIn.b(new Activities.LogIn.Extras.LoginActivityExtras(str, null, 2));
        }
        DeepLinkConfig deepLinkConfig3 = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
        if (deepLinkConfig3 != null ? deepLinkConfig3.e : false) {
            return intentA;
        }
        Intent intentPutExtra = ActivityNavigatorKt.a(Activities.ShopAppSplash.f4530a, ApplicationType.e).putExtra("ShopAppDeepLink.Extras.deferredIntent", intentA);
        Intrinsics.e(intentPutExtra);
        return intentPutExtra;
    }

    public static Intent c(Activities.ContentPage.ContentPageType pageType, String pageId, String str) {
        Intrinsics.h(pageId, "pageId");
        Intrinsics.h(pageType, "pageType");
        Intent intentA = ActivityNavigatorKt.a(Activities.ContentPage.f4461a, ApplicationType.e);
        intentA.putExtra("EXTRA_DATA", new Activities.ContentPage.ContentPageExtras(pageType, pageId, str));
        return intentA;
    }

    public static boolean d(Bundle bundle) {
        DeepLinkConfig deepLinkConfig = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
        if (deepLinkConfig != null) {
            return deepLinkConfig.g;
        }
        return false;
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForAboutPage(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG == null && (strG = extras.getString("contentId")) == null) {
            throw new IllegalStateException("About Page ID cannot be null!");
        }
        return a(extras, new androidx.navigation.internal.h(strG, 18));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForAddRewards(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.navigation.compose.a(1, extras, (DeepLinkConfig) extras.getParcelable("ShopAppDeepLink.Extras.config")));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForAddingAddress(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new h(6));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForArticlePage(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG == null && (strG = extras.getString("contentId")) == null) {
            throw new IllegalStateException("Article Page ID cannot be null!");
        }
        return a(extras, new androidx.navigation.internal.h(strG, 14));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForAuthenticatedWebView(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(9, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForBottomSheet(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(2, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForBrandedShop(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG == null) {
            strG = extras.getString("contentId");
        }
        if (strG == null || strG.length() == 0) {
            throw new IllegalStateException("id cannot be null!");
        }
        return a(extras, new e(extras, strG, 2));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForBundlesActivity(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "argument", extras);
        if (strG == null) {
            strG = "";
        }
        return a(extras, new androidx.navigation.internal.h(strG, 17));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForBuyAgain(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(20));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForCart(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(18));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForCatalogueHome(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(12, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForCataloguePromotionDetails(@NotNull Context context, @NotNull Bundle extras) {
        return a(extras, new a(au.com.woolworths.android.onesite.a.g(context, "context", "extras", "productId", extras), 0, extras.getString("offerId"), extras.getString("requestSource"), extras.getString("containerTitle")));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForCategoryAndEventsPage(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG != null) {
            return a(extras, new c(strG, extras.getString("title"), 0));
        }
        throw new IllegalStateException("Category and Events Page ID cannot be null!");
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForCheckout(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(7));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForContentPlaybook(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG == null && (strG = extras.getString("contentId")) == null) {
            strG = "";
        }
        return a(extras, new androidx.navigation.internal.h(strG, 9));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForCopyToClipboardAction(@NotNull Context context, @NotNull Bundle extras) {
        return a(extras, new c(au.com.woolworths.android.onesite.a.g(context, "context", "extras", TextBundle.TEXT_ENTRY, extras), extras.getString("message"), 2));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForEreceiptDetails(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG == null) {
            strG = "";
        }
        return a(extras, new androidx.navigation.internal.h(strG, 7));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForEventPage(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG == null && (strG = extras.getString("contentId")) == null) {
            throw new IllegalStateException("Events Page ID cannot be null!");
        }
        return a(extras, new androidx.navigation.internal.h(strG, 8));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForEverydayExtraSignUp(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(6, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForEverydayPage(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG == null && (strG = extras.getString("contentId")) == null) {
            throw new IllegalStateException("Everyday Page ID cannot be null!");
        }
        return a(extras, new androidx.navigation.internal.h(strG, 6));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForFeedbackForm(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "formid", extras);
        if (strG != null) {
            return a(extras, new e(strG, extras, 1));
        }
        throw new IllegalStateException("formid cannot be null!");
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForFreshMagHome(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new h(3));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForFulfilmentWindowSelection(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(8, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForGuidePage(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG == null && (strG = extras.getString("contentId")) == null) {
            throw new IllegalStateException("Guide Page ID cannot be null!");
        }
        return a(extras, new androidx.navigation.internal.h(strG, 19));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForHealthyLifeFoodTracker(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(4, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForHelpPage(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG == null && (strG = extras.getString("contentId")) == null) {
            throw new IllegalStateException("Help Page ID cannot be null!");
        }
        return a(extras, new androidx.navigation.internal.h(strG, 4));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForHome(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(14));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForHomeInstoreMode(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(19));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForIdeaPage(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG == null && (strG = extras.getString("contentId")) == null) {
            throw new IllegalStateException("Idea Page ID cannot be null!");
        }
        return a(extras, new e(extras, strG, 3));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForInStoreWifi(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(29));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForInbox(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new h(8));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForMarketplace(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new h(2));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForMoreTab(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(21));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForMyEReceipts(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(23));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForNotificationOptIn(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new h(1));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForNotificationPreferences(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(28));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForOfferDetails(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        DeepLinkConfig deepLinkConfig = (DeepLinkConfig) extras.getParcelable("ShopAppDeepLink.Extras.config");
        String string = extras.getString("id");
        String str = string == null ? "" : string;
        String string2 = extras.getString("type");
        return a(extras, new f(extras, deepLinkConfig, str, string2 == null ? "" : string2, extras.getParcelableArrayList("ShopAppDeepLink.Extras.additionalAnalyticsExtraContent"), 0));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForOlive(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "title", extras);
        boolean z = Boolean.parseBoolean(extras.getString(Member.GUEST_USER, "true"));
        ShopAppDeepLinkDispatchDefinition shopAppDeepLinkDispatchDefinition = f4243a;
        return (Intent) (z ? new ShopAppDeepLinkDispatchDefinition$intentForOlive$deferrableHandler$1(2, shopAppDeepLinkDispatchDefinition, ShopAppDeepLinkDispatchDefinition.class, "deferrable", "deferrable$base_shop_app_release(Landroid/os/Bundle;Lkotlin/jvm/functions/Function0;)Landroid/content/Intent;", 0) : new ShopAppDeepLinkDispatchDefinition$intentForOlive$deferrableHandler$2(2, shopAppDeepLinkDispatchDefinition, ShopAppDeepLinkDispatchDefinition.class, "deferrableFullUserLoggedIn", "deferrableFullUserLoggedIn(Landroid/os/Bundle;Lkotlin/jvm/functions/Function0;)Landroid/content/Intent;", 0)).invoke(extras, new androidx.navigation.internal.h(strG, 5));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForOrders(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "orderId", extras);
        String string = extras.getString("firstExecutedQuery");
        String string2 = extras.getString("shouldChatAutoStarted");
        return a(extras, new i(extras, strG, string, string2 != null ? Boolean.parseBoolean(string2) : false));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    @au.com.woolworths.android.onesite.deeplink.ShopAppScheme
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    @au.com.woolworths.android.onesite.deeplink.WebUrlScheme
    @au.com.woolworths.android.onesite.deeplink.WebUatUrlScheme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Intent intentForOrdersProducts(@org.jetbrains.annotations.NotNull android.content.Context r3, @org.jetbrains.annotations.NotNull android.os.Bundle r4) {
        /*
            java.lang.String r0 = "extras"
            java.lang.String r1 = "orderId"
            java.lang.String r2 = "context"
            java.lang.String r3 = au.com.woolworths.android.onesite.a.g(r3, r2, r0, r1, r4)
            if (r3 == 0) goto L76
            java.lang.String r0 = "ShopAppDeepLink.Extras.config"
            android.os.Parcelable r1 = r4.getParcelable(r0)
            au.com.woolworths.android.onesite.deeplink.DeepLinkConfig r1 = (au.com.woolworths.android.onesite.deeplink.DeepLinkConfig) r1
            r2 = 0
            if (r1 == 0) goto L1a
            boolean r1 = r1.e
            goto L1b
        L1a:
            r1 = r2
        L1b:
            if (r1 == 0) goto L46
            android.os.Parcelable r1 = r4.getParcelable(r0)
            au.com.woolworths.android.onesite.deeplink.DeepLinkConfig r1 = (au.com.woolworths.android.onesite.deeplink.DeepLinkConfig) r1
            if (r1 == 0) goto L28
            boolean r1 = r1.h
            goto L29
        L28:
            r1 = r2
        L29:
            if (r1 == 0) goto L46
            android.os.Parcelable r4 = r4.getParcelable(r0)
            au.com.woolworths.android.onesite.deeplink.DeepLinkConfig r4 = (au.com.woolworths.android.onesite.deeplink.DeepLinkConfig) r4
            if (r4 == 0) goto L36
            boolean r4 = r4.i
            goto L37
        L36:
            r4 = r2
        L37:
            if (r4 != 0) goto L46
            au.com.woolworths.android.onesite.navigation.Activities$MainActivity r4 = au.com.woolworths.android.onesite.navigation.Activities.MainActivity.f4487a
            android.content.Intent r4 = r4.b()
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            android.content.Intent r4 = r4.setFlags(r0)
            goto L4e
        L46:
            au.com.woolworths.android.onesite.navigation.Activities$ShopAppSplash r4 = au.com.woolworths.android.onesite.navigation.Activities.ShopAppSplash.f4530a
            au.com.woolworths.android.onesite.navigation.ApplicationType r0 = au.com.woolworths.android.onesite.navigation.ApplicationType.e
            android.content.Intent r4 = au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt.a(r4, r0)
        L4e:
            au.com.woolworths.android.onesite.navigation.Activities$MyOrders r0 = au.com.woolworths.android.onesite.navigation.Activities.MyOrders.f4491a
            au.com.woolworths.android.onesite.navigation.ApplicationType r1 = au.com.woolworths.android.onesite.navigation.ApplicationType.e
            android.content.Intent r0 = au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt.a(r0, r1)
            au.com.woolworths.android.onesite.navigation.Activities$OrderDetails r1 = au.com.woolworths.android.onesite.navigation.Activities.OrderDetails.f4496a
            android.content.Intent r1 = r1.b(r3, r2)
            au.com.woolworths.android.onesite.navigation.Activities$OrderDetailsYourGroceries r2 = au.com.woolworths.android.onesite.navigation.Activities.OrderDetailsYourGroceries.f4497a
            android.content.Intent r3 = r2.b(r3)
            android.content.Intent[] r3 = new android.content.Intent[]{r0, r1, r3}
            java.util.ArrayList r3 = kotlin.collections.CollectionsKt.k(r3)
            java.lang.String r0 = "ShopAppDeepLink.Extras.deferredIntents"
            android.content.Intent r3 = r4.putParcelableArrayListExtra(r0, r3)
            java.lang.String r4 = "putParcelableArrayListExtra(...)"
            kotlin.jvm.internal.Intrinsics.g(r3, r4)
            return r3
        L76:
            androidx.lifecycle.viewmodel.compose.a r3 = new androidx.lifecycle.viewmodel.compose.a
            r0 = 8
            r3.<init>(r0)
            android.content.Intent r3 = a(r4, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.deeplink.ShopAppDeepLinkDispatchDefinition.intentForOrdersProducts(android.content.Context, android.os.Bundle):android.content.Intent");
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForPastShop(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "title", extras);
        if (strG == null) {
            strG = "";
        }
        return a(extras, new c(strG, extras.getString("basketId"), 1));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForPickupStoreSelection(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(11, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForProductCategory(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        final String string = extras.getString("id");
        final String string2 = extras.getString("title");
        String string3 = extras.getString("type");
        final Activities.ProductSubCategory.ProductCategoryType productCategoryTypeValueOf = string3 != null ? Activities.ProductSubCategory.ProductCategoryType.valueOf(string3) : null;
        final String string4 = extras.getString("source");
        final boolean z = Boolean.parseBoolean(extras.getString("isFinalLevel", "false"));
        if (string2 != null && string != null && productCategoryTypeValueOf != null) {
            return a(extras, new Function0() { // from class: au.com.woolworths.android.onesite.deeplink.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z2 = z;
                    Activities.ProductSubCategory.ProductCategoryType productCategoryType = productCategoryTypeValueOf;
                    String str = string2;
                    String strConcat = string;
                    if (z2) {
                        return Activities.ProductList.f4505a.b(new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(str, null), new Activities.ProductList.ExtrasByProductGroup(strConcat, ShopAppDeepLinkDispatchDefinition.WhenMappings.f4244a[productCategoryType.ordinal()] == 1 ? "categoryOnSpecial" : "category", string4, Activities.ProductList.ProductListType.x), (Activities.ProductList.ExtrasConfig) null, 4), false);
                    }
                    if (ShopAppDeepLinkDispatchDefinition.WhenMappings.f4244a[productCategoryType.ordinal()] == 1) {
                        strConcat = strConcat.concat("_SPECIALS");
                    }
                    return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.j, strConcat, str);
                }
            });
        }
        StringBuilder sbV = YU.a.v("title: ", string2, "; id: ", string, "; type: ");
        sbV.append(productCategoryTypeValueOf);
        throw new IllegalArgumentException(sbV.toString());
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForProductDetails(@NotNull Context context, @NotNull Bundle extras) {
        String str;
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        DeepLinkConfig deepLinkConfig = (DeepLinkConfig) extras.getParcelable("ShopAppDeepLink.Extras.config");
        final boolean z = false;
        final boolean z2 = deepLinkConfig != null ? deepLinkConfig.n : false;
        Integer numValueOf = (deepLinkConfig == null || (str = deepLinkConfig.o) == null) ? null : Integer.valueOf(Integer.parseInt(str));
        final boolean z3 = deepLinkConfig != null ? deepLinkConfig.p : false;
        final String string = extras.getString("articleId");
        if (string == null) {
            throw new IllegalStateException("articleId cannot be null!");
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            Integer numI0 = StringsKt.i0(string);
            if ((numI0 != null ? numI0.intValue() : 0) <= iIntValue) {
                z = true;
            }
        }
        return a(extras, new Function0() { // from class: au.com.woolworths.android.onesite.deeplink.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z4 = z2 && (z || z3);
                String str2 = string;
                if (z4) {
                    return Activities.ProductDetailsActivity.f4503a.b(str2);
                }
                if (z4) {
                    throw new NoWhenBranchMatchedException();
                }
                return Activities.LegacyProductDetails.f4484a.b(str2);
            }
        });
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForProductFinder(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(13));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForProductGroup(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "argument", extras);
        if (strG == null) {
            throw new IllegalStateException("Argument cannot be null");
        }
        String string = extras.getString("type");
        if (string == null) {
            throw new IllegalStateException("Type cannot be null");
        }
        String string2 = extras.getString("title");
        if (string2 == null) {
            string2 = "";
        }
        return a(extras, new a(string2, 1, strG, string, extras.getString("source")));
    }

    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForProductGroupUniversalLink(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "argument", extras);
        if (strG == null) {
            throw new IllegalStateException("Argument cannot be null");
        }
        String string = extras.getString("title");
        if (string == null) {
            string = "";
        }
        return a(extras, new androidx.work.impl.utils.c(1, string, strG, extras.getString("source")));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForProductsTab(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(27));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForPromotions(@NotNull Context context, @NotNull Bundle extras) {
        Intent intentB;
        Activities.ProductList.ExtrasByProductGroup extrasByProductGroup;
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        ProductListPathPlaceholders[] productListPathPlaceholdersArr = ProductListPathPlaceholders.d;
        String string = extras.getString("type");
        List listG0 = CollectionsKt.G0(ProductListTypePlaceholderValues.f);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listG0, 10));
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlaceholderVariables) it.next()).getD());
        }
        String string2 = extras.getString("id");
        String string3 = extras.getString("title", context.getString(R.string.product_list_promotions_default_title));
        String string4 = extras.getString("adTargeting", string3);
        extras.getString("crn");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string5 = extras.getString("category");
        if (string5 != null) {
        }
        Activities.ProductList.ExtrasConfig extrasConfig = new Activities.ProductList.ExtrasConfig(linkedHashMap);
        if (!CollectionsKt.t(arrayList, string) || string2 == null) {
            String string6 = string2 == null ? context.getString(R.string.product_list_promotions_unavailable_error) : null;
            Intent intentC = Activities.MainActivity.f4487a.c(Activities.MainActivity.Tab.d, null);
            if (string6 != null) {
                intentC.putExtra("EXTRA_MESSAGE", string6);
            }
            intentB = intentC;
        } else {
            ProductListTypePlaceholderValues[] productListTypePlaceholderValuesArr = ProductListTypePlaceholderValues.e;
            if (Intrinsics.c(string, "productGroup")) {
                Activities.ProductList.ProductListType productListType = Activities.ProductList.ProductListType.x;
                extrasByProductGroup = new Activities.ProductList.ExtrasByProductGroup(string2, productListType.d, null, productListType);
            } else {
                if (!Intrinsics.c(string, "specialsGroup")) {
                    throw new IllegalStateException("type not implemented yet");
                }
                Charset charset = Charsets.f24671a;
                extrasByProductGroup = new Activities.ProductList.ExtrasByProductGroup(androidx.constraintlayout.core.state.a.j(string2, "?adTargeting=", URLEncoder.encode(string4, charset.name()), "&specialsGroupTitle=", URLEncoder.encode(string3, charset.name())), Activities.ProductList.ProductListType.E.d, null, Activities.ProductList.ProductListType.x);
            }
            Intrinsics.e(string3);
            intentB = Activities.ProductList.f4505a.b(new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(string3, null), (Activities.ProductList.ExtraProductListSource) extrasByProductGroup, extrasConfig, true), false);
        }
        return a(extras, new androidx.lifecycle.a(intentB, 7));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForRatingsAndReviewsDetails(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG != null) {
            return a(extras, new androidx.navigation.internal.h(strG, 15));
        }
        throw new IllegalStateException("Product id cannot be null!");
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForRecipeDetails(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG != null) {
            return a(extras, new androidx.navigation.internal.h(strG, 16));
        }
        throw new IllegalStateException("recipe id cannot be null!");
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForRecipeFeed(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "source", extras);
        String string = extras.getString("title");
        if (string == null) {
            string = "";
        }
        String string2 = extras.getString(k.a.g);
        return a(extras, new d(string, string2 != null ? StringsKt.T(string2, new String[]{","}, 6) : null, strG));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForRecipesHome(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(24));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForRecipesSearch(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "searchBarPlaceholderText", extras);
        if (strG == null) {
            strG = "";
        }
        return a(extras, new androidx.navigation.internal.h(strG, 10));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForRewardsBoosters(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.a((DeepLinkConfig) extras.getParcelable("ShopAppDeepLink.Extras.config"), 6));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForRewardsLogin(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new h(7));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForRewardsOffer(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        DeepLinkConfig deepLinkConfig = (DeepLinkConfig) extras.getParcelable("ShopAppDeepLink.Extras.config");
        if (deepLinkConfig == null || !deepLinkConfig.l) {
            throw new IllegalStateException("Rewards Offer activate deep link not supportedwhen Rewards Activity Uplift is off.");
        }
        return a(extras, new androidx.navigation.internal.h(extras.getString("sectionId"), 2));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForRewardsSignup(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(9));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForSavedRecipes(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(10, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForScanAndGo(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new h(4));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForSelectingAddress(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new h(0));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForSellerRangeDiscovery(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", AppMeasurementSdk.ConditionalUserProperty.NAME, extras);
        if (strG != null) {
            return a(extras, new androidx.navigation.internal.h(strG, 3));
        }
        throw new IllegalStateException("name cannot be null!");
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForServicePage(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG == null && (strG = extras.getString("contentId")) == null) {
            throw new IllegalStateException("Service Page ID cannot be null!");
        }
        return a(extras, new androidx.navigation.internal.h(strG, 1));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForShippingCalculator(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(7, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForShopAppLogin(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(26));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForShopAppSignup(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(10));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForShoppingModeSelection(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(11));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForSngParkingVoucher(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "parkingVoucher", extras);
        if (strG != null) {
            return a(extras, new androidx.navigation.internal.h(strG, 11));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForSpecials(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(1, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForSpecialsTab(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new h(5));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForStoreDetails(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "storeid", extras);
        if (strG != null) {
            return a(extras, new e(strG, extras, 0));
        }
        throw new IllegalStateException("storeid cannot be null!");
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForStoreSelector(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(5, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForSubmitReviews(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG != null) {
            return a(extras, new androidx.navigation.internal.h(strG, 12));
        }
        throw new IllegalStateException("Product id cannot be null!");
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent intentForVideoPage(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "id", extras);
        if (strG == null && (strG = extras.getString("contentId")) == null) {
            throw new IllegalStateException("Video Page ID cannot be null!");
        }
        return a(extras, new androidx.navigation.internal.h(strG, 20));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForVoiceProductFinder(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(22));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForVoiceProductSearch(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(25));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent intentForWebView(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(0, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent taskStackForBoostedOffers(@NotNull Context context, @NotNull Bundle extras) {
        String strG = au.com.woolworths.android.onesite.a.g(context, "context", "extras", "crn", extras);
        if (strG != null) {
            return a(extras, new androidx.navigation.internal.h(strG, 13));
        }
        throw new IllegalStateException("crnHash cannot be null!");
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent taskStackForDeliveryUnlimited(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return b(extras, new androidx.lifecycle.viewmodel.compose.a(12));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    @WebUrlScheme
    @WebUatUrlScheme
    public static final Intent taskStackForDynamicPage(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new b(3, extras));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent taskStackForLists(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(15));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent taskStackForSuggestedList(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(17));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent taskStackForSuggestedLists(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(6));
    }

    @ShopAppScheme
    @JvmStatic
    @NotNull
    public static final Intent taskStackForWatchlist(@NotNull Context context, @NotNull Bundle extras) {
        Intrinsics.h(context, "context");
        Intrinsics.h(extras, "extras");
        return a(extras, new androidx.lifecycle.viewmodel.compose.a(16));
    }
}
