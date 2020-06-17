import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-post',
  templateUrl: './add-post.component.html',
  styleUrls: ['./add-post.component.css']
})
export class AddPostComponent implements OnInit {

  public post: any;
  constructor(private dataService: DataService, private router: Router) {
  }

  ngOnInit() {
  }

  onSubmit() {
    this.dataService.createPost(this.post).subscribe( (post) => {
      this.router.navigate(['']);
    });
  }


}
