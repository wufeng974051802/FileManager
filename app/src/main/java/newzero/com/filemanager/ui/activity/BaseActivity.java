package newzero.com.filemanager.ui.activity;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import newzero.com.filemanager.R;

/**
 * Created by wufeng on 6/13/16.
 */
public class BaseActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ImageView ivLogo;
    private MenuItem inboxMenuItem;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BaseinitView();
    }

    private void BaseinitView() {
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        ivLogo = (ImageView) findViewById(R.id.ivLogo);
        setupToolbar();
    }

    private void setupToolbar() {
        if(toolbar != null){
            setSupportActionBar(toolbar);
            toolbar.setNavigationIcon(R.mipmap.ic_menu_white);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        inboxMenuItem = menu.findItem(R.id.action_inbox);
        inboxMenuItem.setActionView(R.layout.menu_item_view);
        return true;
    }

    public  Toolbar getToolbar(){
        return  toolbar;
    }
    public  MenuItem getInboxMenuItem(){
        return  inboxMenuItem;
    }

    public  ImageView getIvLogo(){
        return  ivLogo;
    }
}
