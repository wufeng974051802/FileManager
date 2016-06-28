package newzero.com.filemanager.ui.activity;

import android.support.v4.widget.DrawerLayout;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import newzero.com.filemanager.R;
import newzero.com.filemanager.ui.activity.BaseActivity;

/**
 * Created by wufeng on 6/13/16.
 */
public class BaseDrawerActivity extends BaseActivity {
    private DrawerLayout drawerLayout;
    private ImageView ivMenuUserProfilePhoto;
    private  int avatarSize;
    private  String profilePhoto;

    @Override
    public void setContentView( int layoutResID) {
        super.setContentView(R.layout.activity_drawer);
        initView();
    }

    protected  void  initView(){
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ivMenuUserProfilePhoto= (ImageView) findViewById(R.id.ivMenuUserProfilePhoto);
        setupHeader();
    }

    protected void setupHeader() {
        this.avatarSize = getResources().getDimensionPixelSize(R.dimen.global_menu_avatar_size);
        this.profilePhoto =  getResources().getString(R.string.user_profile_photo);
        Picasso.with(this)
                .load(profilePhoto)
                .resize(avatarSize,avatarSize)
                .centerCrop()
                .transform()
                .into(ivMenuUserProfilePhoto);

    }

}
