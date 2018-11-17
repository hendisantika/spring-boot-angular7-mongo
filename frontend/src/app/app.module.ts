import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppComponent} from './app.component';
import {ContactComponent} from './contact/contact.component';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {RouterModule, Routes} from '@angular/router';
import {ContactDetailComponent} from './contact-detail/contact-detail.component';
import {ContactCreateComponent} from './contact-create/contact-create.component';


const appRoutes: Routes = [
  {
    path: 'contact',
    component: ContactComponent,
    data: {title: 'Contact List'}
  },
  {
    path: 'contact-detail/:id',
    component: ContactDetailComponent,
    data: {title: 'Contact Details'}
  },
  {
    path: '',
    redirectTo: '/contact',
    pathMatch: 'full'
  }
];

@NgModule({
  declarations: [
    AppComponent,
    ContactComponent,
    ContactDetailComponent,
    ContactCreateComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      {enableTracing: true} // <-- debugging purposes only
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
