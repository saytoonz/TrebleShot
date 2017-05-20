package com.genonbeta.TrebleShot.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;

import com.genonbeta.TrebleShot.helper.ApplicationHelper;

/**
 * Created by: veli
 * Date: 4/10/17 1:00 PM
 */

public class FileChangesReceiver extends BroadcastReceiver
{
	public static final String TAG = FileChangesReceiver.class.getSimpleName();

	public final static String ACTION_FILE_LIST_CHANGED = "com.genonbeta.TrebleShot.action.FILE_LIST_CHANGED";
	public final static String NOT_COMPLETE_JOB = "notCompleteJob";

	@Override
	public void onReceive(Context context, Intent intent)
	{
		if (ACTION_FILE_LIST_CHANGED.equals(intent.getAction()) && !intent.hasExtra(NOT_COMPLETE_JOB))
		{

		}
	}
}
