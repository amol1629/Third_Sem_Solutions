from django.http import HttpResponse
from django.template import loader
def slip(req):
    template = loader.get_template("slip19.html")
    return HttpResponse(template.render())